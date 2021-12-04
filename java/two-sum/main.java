class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // Create a hashmap to speed up index lookup
        HashMap nums_hash = new HashMap();
        
        // Allocate space for the solution
        int[] solution = new int[2]; 
        
        for(int i = 0 ; i<nums.length ; i++){
            int numA = nums[i];
            
            // Check if we have a duplicate and it equals the target
            if(nums_hash.containsKey(numA) && numA*2 == target){
                solution[0] = i;
                solution[1] = (int)nums_hash.get(numA);
                break;
            }
            
            nums_hash.put(numA, i);
            int numB = target-numA;
            
            // Check if we can find the equivalent
            if(numA != numB && nums_hash.containsKey(numB)){
                solution[0] = i;
                solution[1] = (int)nums_hash.get(numB);
                break;
            }
        }
        return solution;
    }
}
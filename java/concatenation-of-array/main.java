class Solution {
    public int[] getConcatenation(int[] nums) {
        // Allocate new memory
        int[] newArray = new int[nums.length*2];
        
        // Populate a concated array
        for(int i = 0 ; i<nums.length; i++){
            newArray[i] = nums[i];
            newArray[i+nums.length] = nums[i];
        }
        
        return newArray;
        
    }
}
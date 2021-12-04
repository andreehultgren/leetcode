class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> hashmap = {};
        
        // Allocate space for the solution
        vector<int> solution = {}; 
        
        
        for(int i = 0 ; i<nums.size() ; i++){
            int numA = nums[i];
            // Check if we have a duplicate and it equals the target
            
            if(hashmap.find(numA) != hashmap.end() && numA*2 == target){
                solution = {i, hashmap[numA]};
                break;
            }
            hashmap.insert({numA, i});
            int numB = target-numA;
            
            // Check if we can find the equivalent
            if(numA != numB && hashmap.find(numB) != hashmap.end()){
                solution = {i, hashmap[numB]};
                break;
            }
        }
        
        return solution;
    }
};

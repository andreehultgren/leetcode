class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        
        // Declaring new vector
        vector<int> newNums;

        // Add the nums array twice
        for (int i=0; i<nums.size(); i++)
            newNums.push_back(nums[i]);
        
        for (int i=0; i<nums.size(); i++)
            newNums.push_back(nums[i]);
        
        return newNums;
    }
};
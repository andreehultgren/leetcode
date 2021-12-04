class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        nums_hash = dict()
        
        for index, numA in enumerate(nums):
            if numA*2 == target and numA in nums_hash:
                solution = [index, nums_hash[numA]]
                break
            
            nums_hash[numA] = index    
            
            numB = target-numA
            if numA != numB and numB in nums_hash:
                solution = [index, nums_hash[numB]]
                break

        return solution

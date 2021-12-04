/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
  nums_hash = {};
  let numA, numB;
  for (let i = 0; i < nums.length; i++) {
    numA = nums[i];

    if (numA in nums_hash && numA * 2 === target) {
      return [i, nums_hash[numA]];
    }

    nums_hash[numA] = i;

    numB = target - numA;
    if (numA !== numB && numB in nums_hash) {
      return [i, nums_hash[numB]];
    }
  }
};

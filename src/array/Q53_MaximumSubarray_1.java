package array;
/*
 * Given an integer array nums, find the subarray 子数组
 with the largest sum, and return its sum.（子数组 是数组中的一个连续部分。）
 
*Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

*Example 2:
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

*Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

 */
// 方法1 ： 动态规划   时间复杂度：O(n)， 空间复杂度：O(1)
public class Q53_MaximumSubarray_1 {
	    public int maxSubArray(int[] nums) {
	        int pre = 0, maxAns = nums[0]; //1. 初始化一个累加和 pre 为 0 和一个最大答案 maxAns 为 nums 的第一个元素。
	        for (int x : nums) {
	            pre = Math.max(pre + x, x);
	            maxAns = Math.max(maxAns, pre);
	        }
	        return maxAns;
	    }
	}

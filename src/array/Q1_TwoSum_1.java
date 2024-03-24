package array;
/*
 * Given an array of integers nums and an integer target,
 *  return indices of the two numbers such that they add up to target.
 *  You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *  You can return the answer in any order.
 *  
 *  Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:
 */

// 方法一：暴解
public class Q1_TwoSum_1 {
	public static int[] twoSum(int[] nums, int target) {
		int n = nums.length;
		for (int i = 0; i <n; i++) {
			for (int j= i +1; j<n ; j ++) {
				if (nums[i] + nums[j] == target) {
					return new int[] {i,j};
				}
			}
		}
	    return new int[0]; 
	}
		public static void main(String[] args) {
			// 如果之前twosum方法定义不是静态（没用static），这里要用个：
			// TwoSum_1 obj = new TwoSum_1();  // 创建 TwoSum_1 类的实例
		int[] result = twoSum( new int[] {123,2,4,5,7,8}, 9);
		System.out.println(result[0]+ " "+result[1]);
	}
	}





/*	Given an integer array nums, return true if any value appears at least twice in the array,
	and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true 
*/
package array;
// 方法一： 暴解（time complexity = O(n^2)）
public class Q217_ContainsDuplicate_1 {
	public static boolean DistinctNumber(int nums[] ) {
		for (int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if (nums[i] == nums[j]) 
				{return true;}}}
		return false;
			
	}
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6};
		int [] b = {1,2,3,4,1,6};
		boolean result_a = DistinctNumber(a);
		boolean result_b = DistinctNumber(b);
		System.out.println("数组a的输出结果是"+result_a+"\n"+"数组b的输出结果是"+result_b);
	}
	}
	





























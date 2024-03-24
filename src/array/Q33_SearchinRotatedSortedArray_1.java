package array;
/*There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.
 * 
Example 1:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Example 2:
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

Example 3:
Input: nums = [1], target = 0
Output: -1
 * 
 */
// 方法一： 二分位查找 Binary Search 
// 关键在于时间复杂程度要等于 O(log n ), O(logn)比O(n)快
public class Q33_SearchinRotatedSortedArray_1 {
	public static int search (int[]nums, int target) {
		 int l =0, n=nums.length;
	        int r=n-1;   
	        if(n==1) return nums[0] == target ? 0:-1;
	        	while(l<=r){
	        		int m =l+(r-l)/2;
	        		if(nums[m]==target) return m;
	        		if(nums[m]>=nums[l]){
	        			if(target<nums[m]&&target>=nums[l]) r=m-1;
	        			else l=m+1;
	        			}
	        		else{
	        			if(nums[r]>=target&&nums[m]<target) l=m+1;
	        			else r=m-1;}}	           
	        return -1;
	}
	public static void main(String[] args) {
		int [] new_array = {5,6,1,2,3,4};
		int searching_num = 1;
		int result = search( new_array,searching_num); 
		System.out.println(result);
	}
}





















package array;

public class Q34_FindFirstandLastPositionofElementinSortedArray_1 {
	class Solution {
	    public int[] searchRange(int[] nums, int target) {
	        int start = lowerBound(nums, target); // 选择其中一种写法即可
	        if (start == nums.length || nums[start] != target) {
	            return new int[]{-1, -1};
	        }
	        int end = lowerBound(nums, target + 1) - 1;
	        return new int[]{start, end};
	    }

	    // lowerBound return the minimum index of element which meets the condition nums[i] >= target 
	    

	    // Closed Interval Approach
	    private int lowerBound(int[] nums, int target) {
	        int left = 0, right = nums.length - 1; 
	        while (left <= right) { 
	            // nums[left-1] < target
	            // nums[right+1] >= target
	            int mid = left + (right - left) / 2;
	            if (nums[mid] < target) {
	                left = mid + 1; 
	            } else {
	                right = mid - 1; 
	            }
	        }
	        return left;
	    }

	    // Left-closed Right-open Interval Approach
	    private int lowerBound2(int[] nums, int target) {
	        int left = 0, right = nums.length; // NOT nums.length-1
	        while (left < right) { 
	            // nums[left-1] < target
	            // nums[right] >= target
	            int mid = left + (right - left) / 2;
	            if (nums[mid] < target) {
	                left = mid + 1; 
	            } else {
	                right = mid; 
	            }
	        }
	        return left; // return left or right 
	    }

	    // Open Interval Approach
	    private int lowerBound3(int[] nums, int target) {
	        int left = -1, right = nums.length; 
	        while (left + 1 < right) { 
	            // nums[left] < target
	            // nums[right] >= target
	            int mid = left + (right - left) / 2;
	            if (nums[mid] < target) {
	                left = mid; 
	            } else {
	                right = mid; 
	            }
	        }
	        return right;
	    }
	}
}

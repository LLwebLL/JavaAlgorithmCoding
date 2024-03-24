package slidingWindow;

public class Q1004_MaxConsecutiveOnesIII_1 {
	class Solution {
	    public int longestSubarray(int[] nums) {
	        int k =1,n=nums.length;
	        int i=0,j;
	        for( j =0;j<n;j++){
	            if(nums[j]==0) k--;
	            if(k<0&&nums[i++]==0) k++;
	        }
	        return j-i-1;
	    }
	}}
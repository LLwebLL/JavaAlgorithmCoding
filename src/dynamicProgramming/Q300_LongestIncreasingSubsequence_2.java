package dynamicProgramming;








// Method 2: DP, On^2,On
public class Q300_LongestIncreasingSubsequence_2 {
	    public int lengthOfLIS(int[] nums) {
	      
	        int[] dp = new int[nums.length];
	        dp[0] = 1;
	        int maxans = 1;
	        for (int i = 1; i < nums.length; i++) {
	            dp[i] = 1;
	            for (int j = 0; j < i; j++) {
	                if (nums[i] > nums[j]) {
	                    dp[i] = Math.max(dp[i], dp[j] + 1);
	                }
	            }
	            maxans = Math.max(maxans, dp[i]);
	        }
	        return maxans;
}}
//dp[i] = max(dp[j])+1,其中 0≤j<i 且num[j]<num[i]
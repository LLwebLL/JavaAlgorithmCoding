package dynamicProgramming;

public class Q377_CombinationSumIV_1 {
// Method 1 : DP O(target*n), O(target)
	public int combinationSum4(int[] nums, int target) {
	        int[] dp = new int[target + 1];
	        dp[0] = 1;
	        for (int i = 1; i <= target; i++) {
	            for (int num : nums) {
	                if (num <= i) {
	                    dp[i] += dp[i - num];
	                }
	            }
	        }
	        return dp[target];
	    }
	}


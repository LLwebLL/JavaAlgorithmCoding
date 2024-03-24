package dynamicProgramming;

public class Q416_PartitionEqualSubsetSum_1 {
	    public boolean canPartition1(int[] nums) {
	        int len = nums.length;
	        int sum = 0;
	        for (int num : nums) {
	            sum += num;
	        }
	        if ((sum & 1) == 1) {
	            return false;
	        }

	        int target = sum / 2;
	        boolean[][] dp = new boolean[len][target + 1];
	        
	        // 初始化成为 true 虽然不符合状态定义，但是从状态转移来说是完全可以的
	        dp[0][0] = true;

	        if (nums[0] <= target) {
	            dp[0][nums[0]] = true;
	        }
	        for (int i = 1; i < len; i++) {
	            for (int j = 0; j <= target; j++) {
	                dp[i][j] = dp[i - 1][j];
	                if (nums[i] <= j) {
	                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i]];
	                }
	            }

	            // 由于状态转移方程的特殊性，提前结束，可以认为是剪枝操作
	            if (dp[i][target]) {
	                return true;
	            }
	        }
	        return dp[len - 1][target];
	    }

	        public boolean canPartition2(int[] nums) {
	            int len = nums.length;
	            int sum = 0;
	            for (int num : nums) {
	                sum += num;
	            }
	            if ((sum & 1) == 1) {
	                return false;
	            }

	            int target = sum / 2;
	            boolean[] dp = new boolean[target + 1];
	            dp[0] = true;

	            if (nums[0] <= target) {
	                dp[nums[0]] = true;
	            }
	            for (int i = 1; i < len; i++) {
	                for (int j = target; nums[i] <= j; j--) {
	                    if (dp[target]) {
	                        return true;
	                    }
	                    dp[j] = dp[j] || dp[j - nums[i]];
	                }
	            }
	            return dp[target];
	        }
	    }
class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;

        //「等和子集」的和必然是总和的一半
        int sum = 0;
        for (int i : nums) sum += i;
        int target = sum / 2;

        // 对应了总和为奇数的情况，注定不能被分为两个「等和子集」
        if (target * 2 != sum) return false;

        // 将「物品维度」取消
        int[] f = new int[target + 1];
        for (int i = 0; i < n; i++) {
            int t = nums[i];
            // 将「容量维度」改成从大到小遍历
            for (int j = target; j >= 0; j--) {
                // 不选第 i 件物品
                int no = f[j];
                // 选第 i 件物品
                int yes = j >= t ? f[j-t] + t : 0;
                f[j] = Math.max(no, yes);
            }
        }
        // 如果最大价值等于 target，说明可以拆分成两个「等和子集」
        return f[target] == target;
    }
}



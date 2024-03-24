package dynamicProgramming;

public class Q494_TargetSum_1 {
	    public int findTargetSumWays(int[] nums, int target) {
	        int sum = 0;
	        for (int num : nums) {
	            sum += num;
	        }
	        int diff = sum - target;
	        if (diff < 0 || diff % 2 != 0) {
	            return 0;
	        }
	        int neg = diff / 2;
	        int[] dp = new int[neg + 1];
	        dp[0] = 1;
	        for (int num : nums) {
	            for (int j = neg; j >= num; j--) {
	                dp[j] += dp[j - num];
	            }
	        }
	        return dp[neg];
	    }
	
    public int findTargetSumWays2(int[] nums, int target) {
int sum =0;
for(int z:nums) sum+=z;
int ret= sum+target;
if(sum<target||ret%2==1||ret<0) return 0;
ret/=2;
int[] dp= new int[ret+1];
dp[0]=1;
for(int x: nums)
    for(int i=ret;i>=x;i--)
        dp[i]+=dp[i-x];

return dp[ret];}}






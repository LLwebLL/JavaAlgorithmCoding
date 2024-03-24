package dynamicProgramming;

public class Q55_JumpGame_1 {
// 贪心： O(n), O(1) Greedy Algorithm
	    public boolean canJump(int[] nums) {
	        int n = nums.length;
	        int rightmost = 0;
	        for (int i = 0; i < n; ++i) {
	            if (i <= rightmost) {
	                rightmost = Math.max(rightmost, i + nums[i]);
	                if (rightmost >= n - 1) {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }
	}

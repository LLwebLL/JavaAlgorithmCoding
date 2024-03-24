package dynamicProgramming;

public class Q45_JumpGameII_1 {
//Method 1: greedy 
	
	    public int jump(int[] nums) {
	        int n = nums.length;
	        int end = 0;
	        int maxPosition = 0; 
	        int steps = 0;
	        for (int i = 0; i < n - 1; i++) {
	            maxPosition = Math.max(maxPosition, i + nums[i]); 
	            if (i == end) {
	                end = maxPosition;
	                steps++;
	            }
	        }
	        return steps;
	    }
	}

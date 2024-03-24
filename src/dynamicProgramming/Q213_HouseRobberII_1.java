package dynamicProgramming;
/*
 * 考虑是否偷 nums[0]\textit{nums}[0]nums[0]：

如果偷 nums[0]\textit{nums}[0]nums[0]，那么 nums[1]\textit{nums}[1]nums[1] 和 nums[n−1]\textit{nums}[n-1]nums[n−1] 不能偷，问题变成从 nums[2]\textit{nums}[2]nums[2] 到 nums[n−2]\textit{nums}[n-2]nums[n−2] 的非环形版本。这里官方题解计算的是 nums[0]\textit{nums}[0]nums[0] 到 nums[n−2]\textit{nums}[n-2]nums[n−2]，感觉绕了一个弯，不如直接求 nums[2]\textit{nums}[2]nums[2] 到 nums[n−2]\textit{nums}[n-2]nums[n−2]。
如果不偷 nums[0]\textit{nums}[0]nums[0]，那么问题变成从 nums[1]\textit{nums}[1]nums[1] 到 nums[n−1]\textit{nums}[n-1]nums[n−1] 的非环形版本。
 * 
 * 
 * 
 */

public class Q213_HouseRobberII_1 {
	    public int rob(int[] nums) {
	        int n = nums.length;
	        return Math.max(nums[0] + rob1(nums, 2, n - 1), rob1(nums, 1, n));
	    }
	    
	    // 198. 打家劫舍
	    private int rob1(int[] nums, int start, int end) { // [start,end) 左闭右开
	        int f0 = 0, f1 = 0;
	        for (int i = start; i < end; ++i) {
	            int newF = Math.max(f1, f0 + nums[i]);
	            f0 = f1;
	            f1 = newF;
	        }
	        return f1;
	    }}
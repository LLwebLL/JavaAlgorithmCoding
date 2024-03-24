package array;


/*
 * 
 * 
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.

Example1:
 Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
 In this case, the max area of water (blue section) the container can contain is 49.
 
Example 2:
Input: height = [1,1]
Output: 1
 */

// 方法一：双指针 
// 时间复杂度：O(N)  空间复杂度：O(1) 
public class Q11_ContainerWithMostWater_1 {
	public static int ans(int[] heights) {
			int l =0, r = heights.length -1;
			int ans =0; 
			while (l<r) {
					int area = Math.min(heights[l],heights[r])* (r-l);
					ans = Math.max(ans, area);
					if (heights[l]<=heights[r]) {l++;}
					else {r--;}}
			return ans;
	}

}

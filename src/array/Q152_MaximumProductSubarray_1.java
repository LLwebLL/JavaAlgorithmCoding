package array;

/*Given an integer array nums, find a subarray that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.

Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 * 
 */
// 方法一： 动态规划
//时间复杂度为 O(n)，渐进空间复杂度为 O(1)
public class Q152_MaximumProductSubarray_1 {

	    public int maxProduct(int[] nums) {
	        int maxF = nums[0], minF = nums[0], ans = nums[0];
	        int length = nums.length;
	        for (int i = 1; i < length; ++i) {
	            int mx = maxF, mn = minF;
	            maxF = Math.max(mx * nums[i], Math.max(nums[i], mn * nums[i]));
	            minF = Math.min(mn * nums[i], Math.min(nums[i], mx * nums[i]));
	            ans = Math.max(maxF, ans);
	        }
	        return ans;
	}}


/*{1, 3, -8, 2, -1}
i=2 
max= -8,  mn = -24, ans(max (-8,3))= 3

i=3 
max = 2 , min = -48  ans = 3 

i =4 
max = (-2, (-1,48))=48, min 不需要计算了
ans (48,3)=48 

*/








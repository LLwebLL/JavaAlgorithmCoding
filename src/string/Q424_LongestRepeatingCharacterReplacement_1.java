package string;



/*You are given a string s and an integer k. 
You can choose any character of the string and change it to any other uppercase English character. 
You can perform this operation at most k times.
Return the length of the longest substring containing the same letter you can get after performing the above operations.
 
Example 1:
Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.

Example 2:
Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achive this answer too.
 
 * 
 * 
 */ 
// 方法一： 双指针 时间复杂度：O(n)，空间复杂度：O(∣Σ∣) 或 O(1)

public class Q424_LongestRepeatingCharacterReplacement_1 {
	    public int characterReplacement(String s, int k) {
	        int[] num = new int[26];
	        int n = s.length();
	        int maxn = 0;
	        int left = 0, right = 0;
	        while (right < n) {
	            num[s.charAt(right) - 'A']++;   
	            // ->例nums[1]++ -> nums[1]+1 nums位置1的地方加1. 
	            // 如果是 ‘A’-‘A’=0 最大为25，因为26个字母，当s.charAt(right)='Z'时
	            maxn = Math.max(maxn, num[s.charAt(right) - 'A']);
	            if (right - left + 1 - maxn > k) {
	                num[s.charAt(left) - 'A']--; 
	          //为何不删除这句话：是你可能会问：既然我们只关心 maxn，为什么还要更新 num 数组呢？
	      //这是因为当right指针移动到新字符时，maxn可能会受到影响（例如，如果新字符的频率超过了当前的maxn），这时我们需要一个准确的num数组来重新计算 maxn。
	                left++;
	            }
	            right++;
	        }
	        return right - left;
	    }
	}



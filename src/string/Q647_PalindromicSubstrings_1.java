package string;
/*Given a string s, return the number of palindromic substrings in it.
A string is a palindrome when it reads the same backward as forward.
A substring is a contiguous sequence of characters within the string.

Example 1:
Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".

Example 2:
Input: s = "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".

 */
// 方法一： 中心扩展算法（Center Expansion Algorithm）
public class Q647_PalindromicSubstrings_1 {
 public int countSubstrings(String s) {
	        int n = s.length(), ans = 0;
	        for (int i = 0; i < 2 * n - 1; ++i) {
	            int l = i / 2, r = i / 2 + i % 2;
	            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
	                --l;
	                ++r;
	                ++ans;}}
     return ans;}}
class Solution647 {    
    int c=0;
    public int countSubstrings(String s) {
    for (int i = 0; i < s.length(); i++) { // i is the mid point
            isPalindrome(s, i, i); // odd length;
            isPalindrome(s, i, i + 1); // even length
        }
        return c;}

    public void isPalindrome(String s, int l ,int r){
    		while (l >=0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
    			c++;l--;r++;
    }
}}
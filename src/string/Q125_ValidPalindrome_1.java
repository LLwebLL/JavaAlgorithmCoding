package string;

/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing
 *  all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters 
 *  include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 * 
 */  
// 方法一： 翻转直接判断

public class Q125_ValidPalindrome_1 {
	    public boolean isPalindrome(String s) {
	        StringBuffer x = new StringBuffer();
	        int n = s.length();
	        for (int i = 0; i < n; i++) {
	            char ch = s.charAt(i);
	            if (Character.isLetterOrDigit(ch)) { // 检查是否为字母或者数字 是则返回 true
	                x.append(Character.toLowerCase(ch));
	            }
	        }
	        StringBuffer x_reverse = new StringBuffer(x).reverse();
	        return x.toString().equals(x_reverse.toString());
	    }
	}





























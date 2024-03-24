package string;


// 方法二： 双指针+空间复杂程度仅为 O(1)
// 双指针："Two Pointers"
public class Q125_ValidPalindrome_2 {
	public boolean isPalindrome(String s) {
	        int n = s.length();
	        int left = 0, right = n - 1;
	        while (left < right) {
	            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
	                ++left;
	            }
	            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
	                --right;
	            }
	            if (left < right) {
	                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
	                    return false;
	                }
	                ++left;
	                --right;
	            }
	        }
	        return true;
	    }
	}

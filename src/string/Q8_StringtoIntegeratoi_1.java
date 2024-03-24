package string;

public class Q8_StringtoIntegeratoi_1 {
	public class Solution {
	    public int myAtoi(String s) {
	        if (s == null || s.length() == 0) return 0;
	        int index = 0, n = s.length();
	        int sign = 1;
	        int result = 0;

	        while (index < n && s.charAt(index) == ' ') {
	            index++;
	        }

	        if (index < n && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
	            sign = s.charAt(index) == '+' ? 1 : -1;
	            index++;
	        }

	        while (index < n) {
	            int digit = s.charAt(index) - '0';
	            if (digit < 0 || digit > 9) break;
	            if (result > (Integer.MAX_VALUE - digit) / 10) {
	                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
	            }
	            result = result * 10 + digit;
	            index++;
	        }

	        return result * sign;
	    }
	}

}

package other;

import java.util.Arrays;

public class SanC_string {
	    public static String getOptimalPermutation(String s) {
	        int ones = 0;
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) == '1') ones++;
	        }
	        char[] arr = new char[s.length()];
	        Arrays.fill(arr, '0');
	            for (int i = s.length() - 1; i>=0&&ones>0; i -= 2, ones--) {
	                arr[i] = '1';
	            }
	            for (int i = (arr[0] == '1') ? 1 : 0; ones > 0 && i < s.length(); i += 2, ones--) {
	                arr[i] = '1';
	            }
	           /* int index = arr[0]=='1'? 1:0;
	            if(ones>0){
		                arr[index] = '1';
		                index+=2;
		                ones--;
		            }*/
		           
	        return new String(arr);
	    }
	    
	    public static void main(String[] args) {
	        String s = "1110011";
	        System.out.println(getOptimalPermutation(s));
	    }
	}

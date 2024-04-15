package string;

public class Q392_IsSubsequence_1 {
	class Solution {
	    public boolean isSubsequence(String s, String t) {
	        int m = s.length(), n = t.length();
	        int i=0,j=0;
	        while(i<m&&j<n){
	            if(s.charAt(i)==t.charAt(j)){
	                i++;
	            }
	            j++;
	        }
	        return i==m;
	    }
	}
}

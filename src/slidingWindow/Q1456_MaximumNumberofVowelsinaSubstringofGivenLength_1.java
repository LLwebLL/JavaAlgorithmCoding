package slidingWindow;

public class Q1456_MaximumNumberofVowelsinaSubstringofGivenLength_1 {
	class Solution {
	    public int maxVowels(String s, int k) {
	        int vowel = 0;
	        for(int i =0; i< k; i++)
	            if(isVowel(s.charAt(i))) vowel++;
	        int max = vowel;
	        for(int i = k; i < s.length(); i++){
	            if(isVowel(s.charAt(i))) vowel++;
	            if(isVowel(s.charAt(i-k))) vowel--;
	            max = Math.max(max, vowel);
	        }
	        return max;
	    }
	    private boolean isVowel(char c){
	        if((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) return true;
	        return false;
	        // OR : return x=='a'||x=='e'||x=='i'||x=='o'||x=='u';
	    }
	}
}

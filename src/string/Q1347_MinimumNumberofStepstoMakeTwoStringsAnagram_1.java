package string;

public class Q1347_MinimumNumberofStepstoMakeTwoStringsAnagram_1 {
	    public int minSteps(String s, String t) {

	        int ans = 0;
	        int[] count = new int[26];

	        // Count occurrences of each character in string s
	        for (char ch : s.toCharArray())
	            ++count[ch - 'a'];

	        // Update occurrences based on string t and calculate steps
	        for (char ch : t.toCharArray()) {
	            count[ch - 'a']--;
	            if (count[ch - 'a'] < 0)
	                ++ans;
	        }

	        return ans;
	    }}
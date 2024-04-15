package array;

public class Q744_FindSmallestLetterGreaterThanTarget_1 {
	//O(log n ) O(1)
	    public char nextGreatestLetter(char[] letters, char target) {
	        int length = letters.length;
	        if (target >= letters[length - 1]) {
	            return letters[0];
	        }
	        int l = 0, r = length - 1;
	        while (l < r) {
	            int m = (r - l) / 2 + l;
	            if (letters[m] > target) {
	                r = m;
	            } else {
	                l = m + 1;
	            }
	        }
	        return letters[l];
	    }
	}


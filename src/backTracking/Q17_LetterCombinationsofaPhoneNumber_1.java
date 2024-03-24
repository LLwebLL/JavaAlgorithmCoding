package backTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// Method: Backtrcking 回溯
public class Q17_LetterCombinationsofaPhoneNumber_1 {
	    public List<String> letterCombinations(String digits) {
	        List<String> combinations = new ArrayList<String>();
	        if (digits.length() == 0) {
	            return combinations;
	        }
	Map<Character, String> phoneMap = new HashMap<Character, String>();
	        	phoneMap.put('2', "abc");
	        	phoneMap.put('3', "def");
	        	phoneMap.put('4', "ghi");
	        	phoneMap.put('5', "jkl");
	        	phoneMap.put('6', "mno");
	        	phoneMap.put('7', "pqrs");
	        	phoneMap.put('8', "tuv");
	        	phoneMap.put('9', "wxyz");

	        backtrack(combinations, phoneMap, digits, 0, new StringBuffer());
	        return combinations;
	    }

	    public void backtrack(List<String> combinations, Map<Character, String> phoneMap, String digits, int index, StringBuffer combination) {
	        if (index == digits.length()) {
	            combinations.add(combination.toString());
	        } else {
	            char digit = digits.charAt(index);
	            String letters = phoneMap.get(digit);
	            int lettersCount = letters.length();
	            for (int i = 0; i < lettersCount; i++) {
	                combination.append(letters.charAt(i));
	                backtrack(combinations, phoneMap, digits, index + 1, combination);
	                combination.deleteCharAt(index);
	            }
	        }
	    }
	}

class Solution22 {
	    public List<String> letterCombinations(String digits) {
	        if (digits.isEmpty()) return Collections.emptyList();

	        String[] phone_map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	        List<String> output = new ArrayList<>();
	        backtrack("", digits, phone_map, output);
	        return output;
	    }

	    private void backtrack(String combination, String next_digits, String[] phone_map, List<String> output) {
	        if (next_digits.isEmpty()) {
	            output.add(combination);
	        } else {
	            String letters = phone_map[next_digits.charAt(0) - '2'];
	            for (char letter : letters.toCharArray()) {
	                backtrack(combination + letter, next_digits.substring(1), phone_map, output);
	            }
	        }
	    }
	}


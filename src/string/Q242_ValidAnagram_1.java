package string;
/*
 * 
 * 	Given two strings s and t, return true if t is an anagram of s, and false otherwise.
	An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 	typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
 
 */
// 解法一： 哈希表 时间复杂程度：O(n) 空间复杂程度：O(S)/O(26)
import java.util.Map;
import java.util.HashMap;

public class Q242_ValidAnagram_1 {
	    public boolean isAnagram(String s, String t) {
	        if (s.length() != t.length()) {
	            return false;
	        }
	        Map<Character, Integer> table = new HashMap<Character, Integer>();
	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            table.put(ch, table.getOrDefault(ch, 0) + 1);
	            //getOrDefault(ch, 0)先获取HashMap中ch的对应值(get)如果没有返回默认值(default)（0）
	        }
	        for (int i = 0; i < t.length(); i++) {
	            char ch = t.charAt(i);
	            table.put(ch, table.getOrDefault(ch, 0) - 1);
	            if (table.get(ch) < 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}




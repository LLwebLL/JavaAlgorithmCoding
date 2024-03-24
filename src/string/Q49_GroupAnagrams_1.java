package string;
/*
 * 
 * Given an array of strings strs, group the anagrams together.
 *  You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.


Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:
Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]
 */
// 方法一： 排序
//时间复杂度：O(k * n log n），空间复杂度：O(k * n)
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Q49_GroupAnagrams_1 {
	    public List<List<String>> groupAnagrams(String[] strs) {
	        Map<String, List<String>> map = new HashMap<String, List<String>>();
	        for (String str : strs) {
	            char[] array = str.toCharArray();
	            Arrays.sort(array);
	            String key = new String(array);
	            List<String> list = map.getOrDefault(key, new ArrayList<String>());
	            list.add(str); //arraylist是add
	            map.put(key, list);//map加东西是put
	        }
	        return new ArrayList<List<String>>(map.values());
	    }
	}




























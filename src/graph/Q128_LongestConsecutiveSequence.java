package graph;
import java.util.Set;
import java.util.HashSet;

// Method 1: Hashset 哈希集合
public class Q128_LongestConsecutiveSequence {
	 public int longestConsecutive(int[] nums) {
	        Set<Integer> s = new HashSet<Integer>();
	        for (int num : nums) {s.add(num);}

	        int longestStreak = 0;

	        for (int num : s) {
	            if (!s.contains(num - 1)) {
	                int current = num;
	                int currentStreak = 1;

	                while (s.contains(current + 1)) {
	                	current += 1;
	                    currentStreak += 1;}
	               
	                longestStreak = Math.max(longestStreak, currentStreak);}}

	        return longestStreak;}}

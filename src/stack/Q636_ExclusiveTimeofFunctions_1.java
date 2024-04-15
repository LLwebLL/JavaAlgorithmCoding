package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Q636_ExclusiveTimeofFunctions_1 {
	class Solution {
	    public int[] exclusiveTime(int n, List<String> logs) {
	        int[] times = new int[n];
	        Deque<int[]> stack = new ArrayDeque<>();
	        for (String log : logs) {
	            String[] strs = log.split(":");
	            int f = Integer.parseInt(strs[0]), t = Integer.parseInt(strs[2]);
	            if (strs[1].equals("start")) stack.push(new int[]{f, t});
	            else {
	                int[] top = stack.pop();
	                times[top[0]] += t - top[1] + 1;
	                if (!stack.isEmpty()) times[stack.peek()[0]] -= t - top[1] + 1;
	            }
	        }
	        return times;
	    }
	}
}

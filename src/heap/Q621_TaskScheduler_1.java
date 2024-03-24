package heap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q621_TaskScheduler_1 {

	    public int leastInterval(char[] tasks, int n) {
	        Map<Character, Integer> freq = new HashMap<Character, Integer>();
	        // 最多的执行次数
	        int maxExec = 0;
	        for (char ch : tasks) {
	            int exec = freq.getOrDefault(ch, 0) + 1;
	            freq.put(ch, exec);
	            maxExec = Math.max(maxExec, exec);
	        }

	        // 具有最多执行次数的任务数量
	        int maxCount = 0;
	        Set<Map.Entry<Character, Integer>> entrySet = freq.entrySet();
	        for (Map.Entry<Character, Integer> entry : entrySet) {
	            int value = entry.getValue();
	            if (value == maxExec) {
	                ++maxCount;
	            }
	        }

	        return Math.max((maxExec - 1) * (n + 1) + maxCount, tasks.length);
	    }
	// MINE

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int taskNum= tasks.length;
       int[] counter = new int[26];
       int maxTask =0;
       int maxNum=0;
       for(char y:tasks) {
    	   counter[y-'A']++;
    	   maxTask= Math.max(maxTask,counter[y-'A']);}
       for(int i =0;i<26;i++){
           if (counter[i]==maxTask) maxNum++;
       }
    return Math.max(taskNum,(maxTask-1)*(n+1)+maxNum);}}}
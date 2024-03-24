package heap;
import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Comparator;

// method 1: heap, 堆
public class Q347_TopKFrequentElements_1 {
	 public int[] topKFrequent(int[] nums, int k) {
	        Map<Integer, Integer> record = new HashMap<Integer, Integer>();
	        
	        for (int num : nums) {
	        	record.put(num, record.getOrDefault(num, 0) + 1);}
	        
	        PriorityQueue<int[]> q = new PriorityQueue<int[]>(new Comparator<int[]>() {
	            public int compare(int[] m, int[] n) {
	                return m[1] - n[1];}}); //每组的第二个元素排序，最头部/左侧为最小，结合之后就是每个count
	        
	        for (Map.Entry<Integer, Integer> x : record.entrySet()) {
	            int num = x.getKey(), count = x.getValue();
	            if (q.size() == k) {
	                if (q.peek()[1] < count) {//头部的count是否小于当前的
	                    q.poll();
	                    q.offer(new int[]{num, count});}}
	            
	            	else {q.offer(new int[]{num, count});}}
	  
	        int[] ans= new int[k];
	        for (int i = 0; i < k; ++i) {
	            ans[i] = q.poll()[0];}
	        
	        return ans;}}




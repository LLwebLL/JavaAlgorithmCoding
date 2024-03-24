package heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Q692_TopKFrequentWords_1 {

	    public List<String> topKFrequent(String[] words, int k) {
	        Map<String, Integer> cnt = new HashMap<String, Integer>();
	        for (String word : words) {
	            cnt.put(word, cnt.getOrDefault(word, 0) + 1);
	        }
	  PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<Map.Entry<String, Integer>>(new Comparator<Map.Entry<String, Integer>>() {
	    public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
	   return entry1.getValue() == entry2.getValue() ? entry2.getKey().compareTo(entry1.getKey()) : entry1.getValue() - entry2.getValue();
	            }
	        });
	        for (Map.Entry<String, Integer> entry : cnt.entrySet()) {
	            pq.offer(entry);
	            if (pq.size() > k) {
	                pq.poll();
	            }
	        }
	        List<String> ret = new ArrayList<String>();
	        while (!pq.isEmpty()) {
	            ret.add(pq.poll().getKey());
	        }
	        Collections.reverse(ret);
	        return ret;
	    }
	}


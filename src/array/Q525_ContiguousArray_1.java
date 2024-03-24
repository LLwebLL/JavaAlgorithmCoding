package array;

import java.util.HashMap;
import java.util.Map;

//方法一：前缀和 + 哈希表 O(n)O(n)
public class Q525_ContiguousArray_1 {

	    public int findMaxLength(int[] nums) {
	        int maxLength = 0;
	        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	        int counter = 0;
	        map.put(counter, -1);
	        int n = nums.length;
	        for (int i = 0; i < n; i++) {
	            int num = nums[i];
	            if (num == 1) {
	                counter++;
	            } else {
	                counter--;
	            }
	            if (map.containsKey(counter)) {
	                int prevIndex = map.get(counter);
	                maxLength = Math.max(maxLength, i - prevIndex);
	            } else {
	                map.put(counter, i);
	            }
	        }
	        return maxLength;
	    }
	}


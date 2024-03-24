package array;

import java.util.Arrays;

public class Q2971_FindPolygonWiththeLargestPerimeter_1 {

	    public long largestPerimeter(int[] nums) {
	        Arrays.sort(nums);
	        long s = 0;
	        for (int x : nums) {
	            s += x;
	        }
	        for (int i = nums.length - 1; i > 1; i--) {
	            int x = nums[i];
	            if (s > x * 2) { // s-x > x
	                return s;
	            }
	            s -= x;
	        }
	        return -1;
	    }
	}


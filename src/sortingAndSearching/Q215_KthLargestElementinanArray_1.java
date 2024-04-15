package sortingAndSearching;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

//Method1: sort (no need)
//Time:O(nlog n)
public class Q215_KthLargestElementinanArray_1 {
		public int findKthLargest(int[] nums, int k) {
				Arrays.sort(nums);
				return nums[nums.length - k];
}

//Method1: Binary Search
//Time:O(log(n)), Space:O(1)
		public int findKthLargest2(int[] nums, int k) {
				List<Integer> numList = new ArrayList<>();
					for (int num : nums) {
							numList.add(num);
						}
						return quickSelect(numList, k);}
		
	    private int quickSelect(List<Integer> nums, int k) {
	        // 随机选择基准数
	        Random rand = new Random();
	        int pivot = nums.get(rand.nextInt(nums.size()));
	        // 将大于、小于、等于 pivot 的元素划分至 big, small, equal 中
	        List<Integer> big = new ArrayList<>();
	        List<Integer> equal = new ArrayList<>();
	        List<Integer> small = new ArrayList<>();
	        for (int num : nums) {
	            if (num > pivot)
	                big.add(num);
	            else if (num < pivot)
	                small.add(num);
	            else
	                equal.add(num);
	        }
	        // kth biggest in the big 
	        if (k <= big.size())
	            return quickSelect(big, k);
	        // h biggest in the small 
	        if (nums.size() - small.size() < k)
	            return quickSelect(small, k - nums.size() + small.size());
	        // h biggest in the equal return pivot 
	        return pivot;
	    }
}









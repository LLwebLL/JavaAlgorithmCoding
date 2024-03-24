package sortingAndSearching;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

//Method1: sort (没必要了)
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
	        // 第 k 大元素在 big 中，递归划分
	        if (k <= big.size())
	            return quickSelect(big, k);
	        // 第 k 大元素在 small 中，递归划分
	        if (nums.size() - small.size() < k)
	            return quickSelect(small, k - nums.size() + small.size());
	        // 第 k 大元素在 equal 中，直接返回 pivot
	        return pivot;
	    }

	    
class solution{
    int quickselect(int[] nums, int l, int r, int k) {
        if (l == r) return nums[k];
        int x = nums[l], i = l - 1, j = r + 1;
        while (i < j) {
            do i++; while (nums[i] < x);
            do j--; while (nums[j] > x);
            if (i < j){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        if (k <= j) return quickselect(nums, l, j, k);
        else return quickselect(nums, j + 1, r, k);
    }
    public int findKthLargest(int[] _nums, int k) {
        int n = _nums.length;
        return quickselect(_nums, 0, n - 1, n - k);
    }
}}









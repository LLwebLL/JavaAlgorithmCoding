package backTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q46_Permutations_1 {
	// Method 1: Recursion O(n×n!) O(n)
	    public List<List<Integer>> permute(int[] nums) {
	        List<List<Integer>> res = new ArrayList<List<Integer>>();

	        List<Integer> output = new ArrayList<Integer>();
	        for (int num : nums) {
	            output.add(num);
	        }

	        int n = nums.length;
	        backtrack(n, output, res, 0);
	        return res;
	    }

	    public void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
	        // 所有数都填完了
	        if (first == n) {
	            res.add(new ArrayList<Integer>(output));
	        }
	        for (int i = first; i < n; i++) {
	            // 动态维护数组
	            Collections.swap(output, first, i);
	            // 继续递归填下一个数
	            backtrack(n, output, res, first + 1);
	            // 撤销操作
	            Collections.swap(output, first, i);
	        }
	    }
	
	    public List<List<Integer>> permute2(int[] nums) {
	    	   List<List<Integer>> list = new ArrayList<>();
	    	   // Arrays.sort(nums); // not necessary
	    	   backtrack2(list, new ArrayList<>(), nums);
	    	   return list;
	    	}

	    	private void backtrack2(List<List<Integer>> list, List<Integer> tempList, int [] nums){
	    	   if(tempList.size() == nums.length){
	    	      list.add(new ArrayList<>(tempList));
	    	   } else{
	    	      for(int i = 0; i < nums.length; i++){ 
	    	         if(tempList.contains(nums[i])) continue; // element already exists, skip
	    	         tempList.add(nums[i]);
	    	         backtrack2(list, tempList, nums);
	    	         tempList.remove(tempList.size() - 1);
	    	      }
	    	   }
	    	} 	    

}
package backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q39_CombinationSum_1 {
	    public List<List<Integer>> combinationSum(int[] candidates, int target) {
	        List<List<Integer>> ans = new ArrayList<List<Integer>>();
	        List<Integer> combine = new ArrayList<Integer>();
	        dfs(candidates, target, ans, combine, 0);
	        return ans;
	    }

	    public void dfs(int[] candidates, int target, List<List<Integer>> ans, List<Integer> combine, int idx) {
	        if (idx == candidates.length) {
	            return;
	        }
	        if (target == 0) {
	            ans.add(new ArrayList<Integer>(combine));
	            return;
	        }

	        dfs(candidates, target, ans, combine, idx + 1);

	        if (target - candidates[idx] >= 0) {
	            combine.add(candidates[idx]);
	            dfs(candidates, target - candidates[idx], ans, combine, idx);
	            combine.remove(combine.size() - 1);
	        }
	    }
}

class solution2{
public List<List<Integer>> combinationSum(int[] nums, int target) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);// 似乎不必要
    backtrack(list, new ArrayList<>(), nums, target, 0);
    return list;
}

private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
    if(remain < 0) return;
    else if(remain == 0) list.add(new ArrayList<>(tempList));
    else{ 
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, remain - nums[i], i); 
            // not i + 1 because we can reuse same elements
            // not i + 1 because we can reuse same elements
            tempList.remove(tempList.size() - 1);
        }
    }
}}
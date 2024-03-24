package backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q78_Subsets_1 {

	    List<Integer> t = new ArrayList<Integer>();
	    List<List<Integer>> ans = new ArrayList<List<Integer>>();

	    public List<List<Integer>> subsets(int[] nums) {
	        dfs(0, nums);
	        return ans;
	    }

	    public void dfs(int cur, int[] nums) {
	        if (cur == nums.length) {
	            ans.add(new ArrayList<Integer>(t));
	            return;
	        }
	        t.add(nums[cur]);
	        dfs(cur + 1, nums);
	        t.remove(t.size() - 1);
	        dfs(cur + 1, nums);
	    }
	}
class solution20{
public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, 0);
    return list;
}

private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
    list.add(new ArrayList<>(tempList));
    for(int i = start; i < nums.length; i++){
        tempList.add(nums[i]);
        backtrack(list, tempList, nums, i + 1);
        tempList.remove(tempList.size() - 1);
    }
}}
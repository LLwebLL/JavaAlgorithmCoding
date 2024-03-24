package backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q90_SubsetsII_1 {
	    List<Integer> path = new ArrayList<>();
	    List<List<Integer>> ans = new ArrayList<>();

	    public List<List<Integer>> subsetsWithDup(int[] nums) {
	        Arrays.sort(nums);
	        dfs(0, nums);
	        return ans;
	    }

	    public void dfs(int i, int[] nums) {
	        if (i == nums.length) {
	            ans.add(new ArrayList<>(path));
	            return;
	        }
	        path.add(nums[i]);
	        dfs(i + 1, nums);
	        path.remove(path.size() - 1);

	        // 不选就跳过后面一样的数，只需要用【78. 子集】的代码加这两行就搞定了！
	        while (i + 1 < nums.length && nums[i + 1] == nums[i])
	            i++;

	        dfs(i + 1, nums);
	    }
	

public List<List<Integer>> subsetsWithDup2(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack2(list, new ArrayList<>(), nums, 0);
    return list;
}

private void backtrack2(List<List<Integer>> list, List<Integer> tempList, int [] nums, int start){
    list.add(new ArrayList<>(tempList));
    for(int i = start; i < nums.length; i++){
        if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
        //这里i>start是关键
        tempList.add(nums[i]);
        
        backtrack2(list, tempList, nums, i + 1);
        tempList.remove(tempList.size() - 1);
    }
} 
}
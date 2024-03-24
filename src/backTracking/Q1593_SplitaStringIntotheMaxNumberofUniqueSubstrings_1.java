package backTracking;

import java.util.HashSet;
import java.util.Set;

public class Q1593_SplitaStringIntotheMaxNumberofUniqueSubstrings_1 {
	class Solution {
	    int ans=0;
	    public int maxUniqueSplit(String s) {
	        Set<String> set= new HashSet<>();
	        dfs(s,set,0,0);
	        return ans;
	    }
	    public void dfs(String s,     Set<String> set, int index, int count ){
	        if(index>=s.length()){
	            ans=Math.max(count,ans);
	            return;
	        }
	        for(int i=index;i<s.length();i++){
	            String now = s.substring(index,i+1);
	            if(!set.add(now)) continue;
	            dfs(s,set,i+1,count+1);
	            set.remove(now);
	        }
	    }
	}
}
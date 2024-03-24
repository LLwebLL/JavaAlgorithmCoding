package backTracking;

import java.util.ArrayList;
import java.util.List;

public class Q22_GenerateParentheses_1 {
// O(4^n/n^(1/2)) O(4^n/n^(1/2))
	// 按括号序列的长度递归
	@SuppressWarnings("rawtypes")
	ArrayList[] cache = new ArrayList[9];

	    @SuppressWarnings("unchecked")
		public List<String> generate(int n) {
	        if (cache[n] != null) {
	            return cache[n];
	        }
	        ArrayList<String> ans = new ArrayList<String>();
	        if (n == 0) {
	            ans.add("");
	        } else {
	            for (int c = 0; c < n; ++c) {
	                for (String left: generate(c)) {
	                    for (String right: generate(n - 1 - c)) {
	                        ans.add("(" + left + ")" + right);
	                    }
	                }
	            }
	        }
	        cache[n] = ans;
	        return ans;
	    }

	    public List<String> generateParenthesis(int n) {
	        return generate(n);
	    }
	}

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        recurse(res, 0, 0, "", n);
        return res;
    }
    
    public void recurse(List<String> res, int left, int right, String s, int n) {
        if (s.length() == n * 2) {
            res.add(s);
            return;
        }
        
        if (left < n) {
            recurse(res, left + 1, right, s + "(", n);
        }
        
        if (right < left) {
            recurse(res, left, right + 1, s + ")", n);
        }
    }
	// See above tree diagram with parameters (left, right, s) for better understanding
}

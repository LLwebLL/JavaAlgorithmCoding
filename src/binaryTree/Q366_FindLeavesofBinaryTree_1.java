package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class Q366_FindLeavesofBinaryTree_1 {
	public class Solution {
		  public class TreeNode {
			      int val;
			      TreeNode left;
			      TreeNode right;
			      TreeNode() {}
			      TreeNode(int val) { this.val = val; }
			      TreeNode(int val, TreeNode left, TreeNode right) {
			          this.val = val;
			          this.left = left;
			          this.right = right;
			      }
			  }
	    public List<List<Integer>> findLeaves(TreeNode root) {
	        List<List<Integer>> res = new ArrayList<>();
	        height(root, res);
	        return res;
	    }
	    private int height(TreeNode node, List<List<Integer>> res){
	        if(null==node)  return -1;
	        int level = 1 + Math.max(height(node.left, res), height(node.right, res));
	        if(res.size()<level+1)  res.add(new ArrayList<>());
	        res.get(level).add(node.val);
	        return level;
	    }
	}
}

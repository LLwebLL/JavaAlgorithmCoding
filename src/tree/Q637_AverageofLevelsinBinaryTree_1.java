package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q637_AverageofLevelsinBinaryTree_1 {
	
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
	public List<Double> averageOfLevels(TreeNode root) {
	    List<Double> result = new ArrayList<>();
	    Queue<TreeNode> q = new LinkedList<>();
	    
	    if(root == null) return result;
	    q.add(root);
	    while(!q.isEmpty()) {
	        int n = q.size();
	        double sum = 0.0;
	        for(int i = 0; i < n; i++) {
	            TreeNode node = q.poll();
	            sum += node.val;
	            if(node.left != null) q.offer(node.left);
	            if(node.right != null) q.offer(node.right);
	        }
	        result.add(sum / n);
	    }
	    return result;
	}
}

package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
// BFS O(n) O(n)
public class Q112_PathSum_1 {
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;}}
	    public boolean hasPathSum(TreeNode root, int sum) {
	        if (root == null) {
	            return false;
	        }
	        Queue<TreeNode> queNode = new LinkedList<TreeNode>();
	        Queue<Integer> queVal = new LinkedList<Integer>();
	        queNode.offer(root);
	        queVal.offer(root.val);
	        while (!queNode.isEmpty()) {
	            TreeNode now = queNode.poll();
	            int temp = queVal.poll();
	            if (now.left == null && now.right == null) {
	                if (temp == sum) {
	                    return true;
	                }
	                continue;
	            }
	            if (now.left != null) {
	                queNode.offer(now.left);
	                queVal.offer(now.left.val + temp);
	            }
	            if (now.right != null) {
	                queNode.offer(now.right);
	                queVal.offer(now.right.val + temp);
	            }
	        }
	        return false;
	    }

class Solution {
	//Recursion O(n) O(H) H = tree's height
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
}
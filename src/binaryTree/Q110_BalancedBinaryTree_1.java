package binaryTree;

public class Q110_BalancedBinaryTree_1 {
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
		      }}
		  
	    public boolean isBalanced(TreeNode root) {
	        return recur(root) != -1;
	    }

	    private int recur(TreeNode root) {
	        if (root == null) return 0;
	        int left = recur(root.left);
	        if (left == -1) return -1;
	        int right = recur(root.right);
	        if (right == -1) return -1;
	        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
	    }    
	

class Solution {
	    public boolean isBalanced(TreeNode root) {
	        return height(root) >= 0;
	    }

	    public int height(TreeNode root) {
	        if (root == null) {
	            return 0;
	        }
	        int leftHeight = height(root.left);
	        int rightHeight = height(root.right);
	        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
	            return -1;
	        } else {
	            return Math.max(leftHeight, rightHeight) + 1;
	        }
	    }
	}}



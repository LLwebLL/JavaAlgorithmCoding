package binarySearchTree;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q230_KthSmallestElementinaBST_1 {
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
		 
	    public int kthSmallest(TreeNode root, int k) {
	        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
	        while (root != null || !stack.isEmpty()) {
	            while (root != null) {
	                stack.push(root);
	                root = root.left;
	            }
	            root = stack.pop();
	            --k;
	            if (k == 0) {
	                break;
	            }
	            root = root.right;
	        }
	        return root.val;
	    }
	}}
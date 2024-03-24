package binarySearchTree;

import java.util.Deque;
import java.util.LinkedList;

// BST Binary Search Tree
public class Q98_ValidateBinarySearchTree_1 {
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
	 
	// Method 1: Recursion On On
	 
		    public boolean isValidBST(TreeNode root) {
		        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
		    }

		    public boolean isValidBST(TreeNode node, long lower, long upper) {
		        if (node == null) {
		            return true;
		        }
		        if (node.val <= lower || node.val >= upper) {
		            return false;
		        }
		        return isValidBST(node.left, lower, node.val) && isValidBST(node.right, node.val, upper);
		    }
// Method 2:Inorder Traversal 中序遍历  On On
    public boolean isValidBST2(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        double inorder = -Double.MAX_VALUE;

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
              // 如果中序遍历得到的节点的值小于等于前一个 inorder，说明不是二叉搜索树
            if (root.val <= inorder) {
                return false;
            }
            inorder = root.val;
            root = root.right;
        }
        return true;
    }
}


	 
	 


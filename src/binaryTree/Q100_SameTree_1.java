package binaryTree;

public class Q100_SameTree_1 {
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
// Method 1:DFS
// Time: O(min(m,n)),Space:O(min(m,n))
	    public boolean isSameTree(TreeNode p, TreeNode q) {
	        if (p == null && q == null) {
	            return true;
	        } else if (p == null || q == null) {
	            return false;
	        } else if (p.val != q.val) {
	            return false;
	        } else {
	            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	        }
	    }
	}


//Method 1:BFS
//Time: O(min(m,n)),Space:O(min(m,n))


//....





package binaryTree;



public class Q236_LowestCommonAncestorofaBinaryTree_1 {
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
	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        if (root == null || root == p || root == q) {
	            return root;     // 1)一个是另外一个的祖先
	        }
	        TreeNode left = lowestCommonAncestor(root.left, p, q);
	        TreeNode right = lowestCommonAncestor(root.right, p, q);
	        if (left != null && right != null) {
	            return root;     // 2)左右两边各自有一个o1、o2，返回这个祖先"
	        }
	        return left != null ? left : right;
	        // 1) / 2) 找不到，回溯时一直是null，如果找到了，那么将找到的值往上窜！
	    }
	}


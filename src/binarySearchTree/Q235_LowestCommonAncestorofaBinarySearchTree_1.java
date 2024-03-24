package binarySearchTree;



public class Q235_LowestCommonAncestorofaBinarySearchTree_1 {
	 public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	    TreeNode(int x) { val = x; }
	 }
	  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        while ((double)(root.val - p.val) * (root.val - q.val) > 0){
	            root = p.val < root.val ? root.left : root.right;}

	        return root;
	    }}




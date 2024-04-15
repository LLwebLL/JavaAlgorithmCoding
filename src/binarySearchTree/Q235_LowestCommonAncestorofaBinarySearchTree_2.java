package binarySearchTree;

import binarySearchTree.Q108_ConvertSortedArraytoBinarySearch_1.TreeNode;

public class Q235_LowestCommonAncestorofaBinarySearchTree_2 {
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

  class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    TreeNode ancestor = root;
        while (true) {
            if (p.val < ancestor.val && q.val < ancestor.val) {
                ancestor = ancestor.left;
            } else if (p.val > ancestor.val && q.val > ancestor.val) {
                ancestor = ancestor.right;
            } else {
                break;
            }
        }
        return ancestor;
    }
  }}

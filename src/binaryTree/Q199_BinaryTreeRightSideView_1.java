package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q199_BinaryTreeRightSideView_1 {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;}
// Method 1 : BFS On On     
	    public List<Integer> rightSideView(TreeNode root) {
	        List<Integer> res = new ArrayList<>();
	        if (root == null) {
	            return res;
	        }
	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.offer(root);
	        while (!queue.isEmpty()) {
	            int size = queue.size();
	            for (int i = 0; i < size; i++) {
	                TreeNode node = queue.poll();
	                if (node.left != null) {
	                    queue.offer(node.left);
	                }
	                if (node.right != null) {
	                    queue.offer(node.right);
	                }
	                if (i == size - 1) {  //将当前层的最后一个节点放入结果列表
	                    res.add(node.val);
	                }
	            }
	        }
	        return res;
	    }
// Method 2: DFS On On	
	    class Solution {
	        List<Integer> res = new ArrayList<>();

	        public List<Integer> rightSideView(TreeNode root) {
	            dfs(root, 0); // 从根节点开始访问，根节点深度是0
	            return res;
	        }

	        private void dfs(TreeNode root, int depth) {
	            if (root == null) {
	                return;
	            }
	            // 先访问 当前节点，再递归地访问 右子树 和 左子树。
	            if (depth == res.size()) {   // 如果当前节点所在深度还没有出现在res里，说明在该深度下当前节点是第一个被访问的节点，因此将当前节点加入res中。
	                res.add(root.val);
	            }
	            depth++;
	            dfs(root.right, depth);
	            dfs(root.left, depth);
	        }
	    }
}}
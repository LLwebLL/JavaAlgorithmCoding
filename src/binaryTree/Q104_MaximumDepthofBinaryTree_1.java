package binaryTree;
import java.util.Queue;
import java.util.LinkedList;
public class Q104_MaximumDepthofBinaryTree_1 {
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
// Method 1 : DFS
// Time: O(n),  Space: O(height)
	 public int maxDepth(TreeNode root) {

	        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	    }
	
// Method 1 : BFS
// Time: O(n),  Space: worst case: O(n)
	public int maxDepth2(TreeNode root) {
	    if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int ans = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                size--;
            }
            ans++;
        }
        return ans;}}

package linkedList;


public class Q117_PopulatingNextRightPointersinEachNodeII_1 {
	class Solution {
		class Node {
		    public int val;
		    public Node left;
		    public Node right;
		    public Node next;

		    public Node() {}
		    
		    public Node(int _val) {
		        val = _val;
		    }

		    public Node(int _val, Node _left, Node _right, Node _next) {
		        val = _val;
		        left = _left;
		        right = _right;
		        next = _next;
		    }
		};
	    public Node connect(Node root) {
	        Node cur = root;
	        while (cur != null) {
	            Node dummy = new Node(0);
	            Node p = dummy;
	            while (cur != null) {
	                if (cur.left != null) {
	                    p.next = cur.left;
	                    p = p.next;
	                }
	                if (cur.right != null) {
	                    p.next = cur.right;
	                    p = p.next;
	                }
	                cur = cur.next;
	            }
	            cur = dummy.next;
	        }
	        return root;
	    }
	}
}

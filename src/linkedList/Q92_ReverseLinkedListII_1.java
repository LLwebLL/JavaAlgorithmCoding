package linkedList;



public class Q92_ReverseLinkedListII_1 {
	class Solution {
		public class ListNode {
		     int val;
		     ListNode next;
		     ListNode() {}
		     ListNode(int val) { this.val = val; }
		     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
		//O(n),O(1)
	    public ListNode reverseBetween(ListNode head, int left, int right) {
	        ListNode dummyNode = new ListNode(-1);
	        dummyNode.next = head;
	        ListNode pre = dummyNode;
	        for (int i = 0; i < left - 1; i++) {
	            pre = pre.next;
	        }
	        ListNode cur = pre.next;
	        ListNode next;
	        for (int i = 0; i < right - left; i++) {
	            next = cur.next;
	            cur.next = next.next;
	            next.next = pre.next;
	            pre.next = next;
	        }
	        return dummyNode.next;
	    }
	}
}

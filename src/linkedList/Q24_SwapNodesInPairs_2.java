package linkedList;

import linkedList.Q24_SwapNodesInPairs_1.ListNode;

public class Q24_SwapNodesInPairs_2 {
	class Solution {
		 public class ListNode {
		     int val;
		     ListNode next;
		     ListNode() {}
		     ListNode(int val) { this.val = val; }
		     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
		 //O(n),O(1)
	    public ListNode swapPairs(ListNode head) {
	        ListNode dummyHead = new ListNode(0);
	        dummyHead.next = head;
	        ListNode temp = dummyHead;
	        while (temp.next != null && temp.next.next != null) {
	            ListNode node1 = temp.next;
	            ListNode node2 = temp.next.next;
	            temp.next = node2;
	            node1.next = node2.next;
	            node2.next = node1;
	            temp = node1;
	        }
	        return dummyHead.next;
	    }
	}
}

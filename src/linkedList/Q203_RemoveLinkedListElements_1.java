package linkedList;

import linkedList.Q206_ReverseLinkedList_1.ListNode;

public class Q203_RemoveLinkedListElements_1 {
	// O(n), O(n)
	class Solution {
	    public ListNode removeElements(ListNode head, int val) {
	        if (head == null) {
	            return head;
	        }
	        head.next = removeElements(head.next, val);
	        return head.val == val ? head.next : head;
	    }
	}
}

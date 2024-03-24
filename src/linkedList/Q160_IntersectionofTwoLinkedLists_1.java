package linkedList;


public class Q160_IntersectionofTwoLinkedLists_1 {
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	    if (headA == null || headB == null) return null;
	    ListNode pA = headA, pB = headB;
	    while (pA != pB) {
	        pA = pA == null ? headB : pA.next;
	        pB = pB == null ? headA : pB.next;
	    }
	    return pA;
	}}

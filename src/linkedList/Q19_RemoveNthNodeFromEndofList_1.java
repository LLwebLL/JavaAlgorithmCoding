package linkedList;

public class Q19_RemoveNthNodeFromEndofList_1 {
	 public class ListNode {
		     int val;
		     ListNode next;
		     ListNode() {}
		     ListNode(int val) { this.val = val; }
		     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
		 
	    public ListNode removeNthFromEnd(ListNode head, int n) {
	        ListNode dummy = new ListNode(0, head);
	        ListNode first = head;
	        ListNode second = dummy;
	        for (int i = 0; i < n; ++i) {
	            first = first.next;
	        }
	        while (first != null) {
	            first = first.next;
	            second = second.next;
	        }
	        second.next = second.next.next;
	        ListNode ans = dummy.next;
	        return ans;
	    }
    public ListNode removeNthFromEnd2(ListNode head, int n) {
      ListNode slow=head, fast= head;
      for(int i =0;i<n;i++) fast= fast.next;
      if(fast==null) return head.next;
      while(fast.next!=null){
          slow=slow.next;
          fast=fast.next;
      }
      slow.next=slow.next.next;
      return head;
      }}






package linkedList;



public class Q24_SwapNodesInPairs_1 {
	  public class ListNode {
		     int val;
		     ListNode next;
		     ListNode() {}
		     ListNode(int val) { this.val = val; }
		     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	  // O(n), O(n)
	    public ListNode swapPairs(ListNode head) {
	        if (head == null || head.next == null) {
	            return head;
	        }
	        ListNode newHead = head.next;
	        head.next = swapPairs(newHead.next);
	        newHead.next = head;
	        return newHead;
	    }
	}

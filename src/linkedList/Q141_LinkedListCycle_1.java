package linkedList;

import java.util.HashSet;
import java.util.Set;

//Method 1: Hash Table On   On


public class Q141_LinkedListCycle_1 {
 class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		           val = x;
		         next = null;
		      }}
		  
	    public boolean hasCycle(ListNode head) {
	        Set<ListNode> seen = new HashSet<ListNode>();
	        while (head != null) {
	            if (!seen.add(head)) {
	                return true;
	            }
	            head = head.next;
	        }
	        return false;
	    }
// Method 2: 快慢指针 龟兔赛跑
	        public boolean hasCycle2(ListNode head) {
	            if (head == null || head.next == null) {
	                return false;
	            }
	            ListNode slow = head;
	            ListNode fast = head.next;
	            while (slow != fast) {
	                if (fast == null || fast.next == null) {
	                    return false;
	                }
	                slow = slow.next;
	                fast = fast.next.next;
	            }
	            return true;
	        }
	    }


package linkedList;

import linkedList.Q206_ReverseLinkedList_1.ListNode;

public class Q61_RotateList_1 {
	class Solution {
	    public ListNode rotateRight(ListNode head, int k) {
	        if(head==null|| head.next==null|| k==0) return head;
	        int n =1;
	        ListNode iter = head;
	        while(iter.next!=null){
	            iter= iter.next;
	            n++;
	        }
	    int add = n-k%n;
	    if(add==n) return head;
	    iter.next = head;
	    while(add-->0){
	        iter=iter.next;
	    }
	    ListNode ans = iter.next;
	    iter.next= null;
	    return ans;
	    }
	}
}

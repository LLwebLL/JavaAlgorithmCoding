package heap;

import java.util.PriorityQueue;

public class Q23_MergekSortedLists_1 {
	class Solution {
		public class ListNode {
			      int val;
			      ListNode next;
			      ListNode() {}
			      ListNode(int val) { this.val = val; }
			      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
			  }
		
    PriorityQueue<ListNode> pq = new PriorityQueue<>(((o1, o2) -> {return  o1.val-o2.val;}));
    public ListNode mergeKLists(ListNode[] lists) {
        for(ListNode node:lists){
            if(node!=null){
                pq.offer(node);
            }
        }
        ListNode dummy = new ListNode(-1); // or no -1
        ListNode cur = dummy;
        while(!pq.isEmpty()){
            ListNode s = pq.poll();
            cur.next = s;
            cur=cur.next;
            s = s.next;
            if(s!=null){
                pq.offer(s);
            }
        }
        return dummy.next;
    }
  }
}

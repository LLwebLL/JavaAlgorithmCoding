package linkedList;

public class Q2_AddTwoNumbers_1 {
	 public class ListNode {
		     int val;
		     ListNode next;
		     ListNode() {}
		     ListNode(int val) { this.val = val; }
		     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode pre = new ListNode(0);
	        ListNode cur = pre;
	        int carry = 0;
	        while(l1 != null || l2 != null) {
	            int x = l1 == null ? 0 : l1.val;
	            int y = l2 == null ? 0 : l2.val;
	            int sum = x + y + carry;
	            
	            carry = sum / 10;
	            sum = sum % 10;
	            cur.next = new ListNode(sum);

	            cur = cur.next;
	            if(l1 != null)
	                l1 = l1.next;
	            if(l2 != null)
	                l2 = l2.next;
	        }
	        if(carry == 1) {
	            cur.next = new ListNode(carry);
	        }
	        return pre.next;
	    }
	}
/*这个例子中，我们要计算的是 999 + 1，期望的结果是：

result: 0 -> 0 -> 0 -> 1
当循环处理完最后一个数字（最高位的9和不存在的位），结果链表是：

0 -> 0 -> 0
并且 carry 是1，因为 9 + 1 = 10。

如果没有 if (carry == 1) { cur.next = new ListNode(carry); } 
这个检查，那么最后的进位就不会被添加到结果链表中，我们就会丢失1000位上的1。
*/
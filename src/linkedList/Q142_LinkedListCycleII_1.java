package linkedList;



public class Q142_LinkedListCycleII_1 {

	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	    public ListNode detectCycle(ListNode head) {
	          ListNode slow = head, fast = head;
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	            if (slow == fast) break;
	        }
	        if (fast == null || fast.next == null) return null;
	        while (head != slow) {
	            head = head.next;
	            slow = slow.next;
	        }
	        return head;
	    }
	}

/* 设链表共有 a+ba+ba+b 个节点，其中 链表头部到链表入口 有 aaa 个节点（不计链表入口节点）， 链表环 有 bbb 个节点（这里需要注意，aaa 和 bbb 是未知数，例如图解上链表 a=4a=4a=4 , b=5b=5b=5）；设两指针分别走了 fff，sss 步，则有：

fast 走的步数是 slow 步数的 222 倍，即 f=2sf = 2sf=2s；（解析： fast 每轮走 222 步）
fast 比 slow 多走了 nnn 个环的长度，即 f=s+nbf = s + nbf=s+nb；（ 解析： 双指针都走过 aaa 步，然后在环内绕圈直到重合，重合时 fast 比 slow 多走 环的长度整数倍 ）。
将以上两式相减得到 f=2nbf = 2nbf=2nb，s=nbs = nbs=nb，即 fast 和 slow 指针分别走了 2n2n2n，nnn 个环的周长。

接下来该怎么做呢？

如果让指针从链表头部一直向前走并统计步数k，那么所有 走到链表入口节点时的步数 是：k=a+nbk=a+nbk=a+nb ，即先走 aaa 步到入口节点，之后每绕 111 圈环（ bbb 步）都会再次到入口节点。而目前 slow 指针走了 nbnbnb 步。因此，我们只要想办法让 slow 再走 aaa 步停下来，就可以到环的入口。

*/
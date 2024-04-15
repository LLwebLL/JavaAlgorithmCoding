package linkedList;

import java.util.ArrayList;
import java.util.List;

import linkedList.Q206_ReverseLinkedList_1.ListNode;

public class Q234_PalindromeLinkedList_1 {
//O(n), O(n)
	class Solution {
	    public boolean isPalindrome(ListNode head) {
	        List<Integer> vals = new ArrayList<Integer>();

	        ListNode node = head;
	        while (node != null) {
	            vals.add(node.val);
	            node = node.next;
	        }

	        int l = 0;
	        int r = vals.size() - 1;
	        while (l < r) {
	            if (!vals.get(l).equals(vals.get(r))) {
	                return false;
	            }
	            l++;
	            r--;
	        }
	        return true;
	    }
	}
}

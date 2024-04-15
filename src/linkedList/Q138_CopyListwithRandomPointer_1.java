package linkedList;

import java.util.HashMap;
import java.util.Map;

public class Q138_CopyListwithRandomPointer_1 {
	class Node {
	    int val;
	    Node next;
	    Node random;

	    public Node(int val) {
	        this.val = val;
	        this.next = null;
	        this.random = null;
	    }
	}
	
	Map<Node,Node> m = new HashMap<>();
	
	public Node copyRandomList(Node head) {
		if(head==null) return null;
	    if (!m.containsKey(head)) {
	    Node copy =  new Node(head.val);
	    m.put(head,copy);
	    copy.next = copyRandomList(head.next);
	    copy.random = copyRandomList(head.random);
	    }
	    return m.get(head);
	}
}

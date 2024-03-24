package graph;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

// Method from Utube, DFS
public class Q133_CloneGraph_3 {
	class Node {
        public int val;
        public ArrayList<Node> neighbors;
        
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;}}


public Node cloneGraph(Node node) {
    if(node==null) return null;
    Map<Integer, Node> m = new HashMap<>();
    return cloneGraph(node,m );}

    private Node cloneGraph(Node node, Map<Integer, Node> m ){
        if (m.containsKey(node.val)) return m.get(node.val);
        Node clone = new Node(node.val);
           m.put (node.val, clone);
        for(Node neighbor : node.neighbors) clone.neighbors.add(cloneGraph(neighbor,m));
        return clone;

        }
    }


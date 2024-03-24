package graph;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

// 方法一： DFS Depth-first search 深度优先搜索
public class Q133_CloneGraph_1 {
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

    
 class Solution{
        Map<Node,Node> visited = new HashMap <>();

        Node cloneGraph(Node node){
        	if (node == null) return null;
        	if (visited.containsKey(node)){return visited.get(node);}
        	Node clone = new Node (node.val, new ArrayList<>());
        	visited.put(node, clone);
   	    for (Node neighbor: node.neighbors){
   	    	clone.neighbors.add(cloneGraph(neighbor));}

   	    return clone;}}}











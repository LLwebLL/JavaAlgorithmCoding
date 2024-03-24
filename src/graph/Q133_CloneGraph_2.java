package graph;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.Queue;

// 方法二： BFS Breadth-first search 广度优先搜索  
public class Q133_CloneGraph_2 {
class Node {
	public int val;
	public List<Node> neighbors;
	
	public Node() {
		val = 0;
		neighbors = new ArrayList<Node>();}
	
	public Node(int _val) {
		val = _val;
		neighbors = new ArrayList<Node>();}
	
	
	public Node(int _val, ArrayList<Node> _neighbors) {
		val = _val;
		neighbors = _neighbors;}}
	
public Node cloneGraph(Node node) {
    if (node == null) {
        return null;
    }
    
    Map<Node, Node> visited = new HashMap<>();
    // BFS队列
    Queue<Node> queue = new LinkedList<>();
    queue.offer(node);
    visited.put(node, new Node(node.val, new ArrayList<>()));

    while (!queue.isEmpty()) {
        Node current = queue.poll();//第一次循环后加入的是list[2,4],所以poll一次取出的先是2
        for (Node adjacentNode : current.neighbors) {
            if (!visited.containsKey(adjacentNode)) {
                visited.put(adjacentNode, new Node(adjacentNode.val, new ArrayList<>()));
                queue.add(adjacentNode);
            }
            visited.get(current).neighbors.add(visited.get(adjacentNode));
        }
    }

    return visited.get(node);}}






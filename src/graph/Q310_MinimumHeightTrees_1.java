package graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import java.util.Queue;
public class Q310_MinimumHeightTrees_1 {
	    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
	        List<Integer> res = new ArrayList<>();
	        if (n == 1) {
	            res.add(0);
	            return res;
	        }
	    
	        /*建立各个节点的出度表*/
	        int[] degree = new int[n];
	        /*建立图关系，在每个节点的list中存储相连节点*/
	        List<List<Integer>> map = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	            map.add(new ArrayList<>());
	        }
	        for (int[] edge : edges) {
	            degree[edge[0]]++;
	            degree[edge[1]]++;/*出度++*/
	            map.get(edge[0]).add(edge[1]);/*添加相邻节点*/
	            map.get(edge[1]).add(edge[0]);
	        }
	        Queue<Integer> queue = new LinkedList<>();
	        for (int i = 0; i < n; i++) {
	            if (degree[i] == 1) queue.offer(i);
	        }
	        while (!queue.isEmpty()) {
	            res = new ArrayList<>();
	            int size = queue.size();/*这是每一层的节点的数量*/
	            for (int i = 0; i < size; i++) {
	                int cur = queue.poll();
	                res.add(cur);/*把当前节点加入结果集，不要有疑问，为什么当前只是叶子节点为什么要加入结果集呢?
	                因为我们每次循环都会新建一个list，所以最后保存的就是最后一个状态下的叶子节点，
	                这也是很多题解里面所说的剪掉叶子节点的部分，你可以想象一下图，每层遍历完，
	                都会把该层（也就是叶子节点层）这一层从队列中移除掉，
	                不就相当于把原来的图给剪掉一圈叶子节点，形成一个缩小的新的图吗*/
	                List<Integer> neighbors = map.get(cur);
	                for (int neighbor : neighbors) {
	                    degree[neighbor]--;
	                    if (degree[neighbor] == 1) {
	                        /*如果是叶子节点我们就入队*/
	                        queue.offer(neighbor);
	                    }
	                }
	            }
	        }
	        return res;/*返回最后一次保存的list*/
	    }

	}



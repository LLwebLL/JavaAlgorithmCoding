package other;
import java.util.ArrayList;
import java.util.List;
public class SanC_getTheGroups {
	
	    public static List<Integer> getTheGroups(int n, String[] queryType, int[] students1, int[] students2) {
	        UnionFind uf = new UnionFind(n);
	        List<Integer> result = new ArrayList<>();

	        for (int i = 0; i < queryType.length; i++) {
	            if (queryType[i].equals("Friend")) {
	                uf.union(students1[i] - 1, students2[i] - 1);
	            } else if (queryType[i].equals("Total")) {
	                int groupSize1 = uf.size(students1[i] - 1);
	                int groupSize2 = uf.size(students2[i] - 1);
	                result.add(groupSize1 + groupSize2);
	            }
	        }

	        return result;
	    }

	    static class  UnionFind {
	        private int[] parent;
	        private int[] size;

	        public UnionFind(int n) {
	            parent = new int[n];
	            size = new int[n];
	            for (int i = 0; i < n; i++) {
	                parent[i] = i;
	                size[i] = 1;
	            }
	        }

	        public void union(int a, int b) {
	            int rootA = find(a);
	            int rootB = find(b);
	            if (rootA != rootB) {
	                if (size[rootA] < size[rootB]) {
	                    parent[rootA] = rootB;
	                    size[rootB] += size[rootA];
	                } else {
	                    parent[rootB] = rootA;
	                    size[rootA] += size[rootB];
	                }
	            }
	        }

	        public int find(int i ){
	            if(parent[i]!=i){
	                parent[i]= find(parent[i]);

	            }
	            return parent[i];
	        }
	    
	        public int size(int a) {
	            return size[find(a)];
	        }
	    }
	        public static void main(String[] args) {
	            int n = 4; // 学生总数
	            String[] queryType = {"Friend", "Friend", "Total"};
	            int[] students1 = {1, 2, 1};
	            int[] students2 = {2, 3, 4}; // 根据您的最后一个例子进行设置

	            List<Integer> result = getTheGroups(n, queryType, students1, students2);
	            System.out.println(result);
	        
	    } 
	}


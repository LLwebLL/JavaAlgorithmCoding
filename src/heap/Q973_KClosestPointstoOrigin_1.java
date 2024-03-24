package heap;
import java.util.PriorityQueue;
import java.util.Comparator;

// Method 1 : Heap\
//  time: O(nlogk),    space: O(k) 
public class Q973_KClosestPointstoOrigin_1 {
	    public int[][] kClosest(int[][] points, int k) {
	        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
	            public int compare(int[] array1, int[] array2) {
	                return array2[0] - array1[0];
	            }
	        });
	        for (int i = 0; i < k; ++i) {
	            pq.offer(new int[]{points[i][0] * points[i][0] + points[i][1] * points[i][1], i});
	        }
	        
	        int n = points.length;
	        for (int i = k; i < n; ++i) {
	            int dist = points[i][0] * points[i][0] + points[i][1] * points[i][1];
	            if (dist < pq.peek()[0]) {
	                pq.poll();
	                pq.offer(new int[]{dist, i});
	            }
	        }
	        
	        int[][] ans = new int[k][2];
	        for (int i = 0; i < k; ++i) {
	            ans[i] = points[pq.poll()[1]];
	        }
	        return ans;
	    }
	}


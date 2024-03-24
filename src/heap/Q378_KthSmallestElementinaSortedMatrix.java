package heap;

import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Arrays;
// Method 1 : Heap
// time complexity: O(k log n) , time complexity:O(n)
public class Q378_KthSmallestElementinaSortedMatrix {
	   public int kthSmallest(int[][] matrix, int k) {
	        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
	            public int compare(int[] a, int[] b) {
	                return a[0] - b[0];
	            }
	        });
	        int n = matrix.length;
	        for (int i = 0; i < n; i++) {
	            pq.offer(new int[]{matrix[i][0], i, 0});
	        }
	        for (int i = 0; i < k - 1; i++) {
	            int[] now = pq.poll();
	            if (now[2] != n - 1) {
	                pq.offer(new int[]{matrix[now[1]][now[2] + 1], now[1], now[2] + 1});
	            }
	        }
	        return pq.poll()[0];
	    }
	
// Method 2 : Sort
// time complexity: O(n^2 log n) , time complexity:O(n^2)
    public int kthSmallest2(int[][] matrix, int k) {
        int rows = matrix.length, columns = matrix[0].length;
        int[] sorted = new int[rows * columns];
        int index = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sorted[index++] = num;
            }
        }
        Arrays.sort(sorted);
        return sorted[k - 1];
    }

    
    
// Method 3 : binary search 
// time complexity: O(nlog(r−l)) , time complexity:O(1)
    
    public int kthSmallest3(int[][] matrix, int k) {
    	        int n = matrix.length;
    	        int left = matrix[0][0];
    	        int right = matrix[n - 1][n - 1];
    	        while (left < right) {
    	            int mid = left + ((right - left) >> 1);
    	            if (check(matrix, mid, k, n)) {
    	                right = mid;
    	            } else {
    	                left = mid + 1;
    	            }
    	        }
    	        return left;
    	    }

    	    public boolean check(int[][] matrix, int mid, int k, int n) {
    	        int i = n - 1;
    	        int j = 0;
    	        int num = 0;
    	        while (i >= 0 && j < n) {
    	            if (matrix[i][j] <= mid) {
    	                num += i + 1;
    	                j++;
    	            } else {
    	                i--;
    	            }
    	        }
    	        return num >= k;
    	    }
    	}


    










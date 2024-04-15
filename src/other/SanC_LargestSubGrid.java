package other;

public class SanC_LargestSubGrid {
	    public static int largestSubGrid(int[][] grid, int maxSum) {
	        int n = grid.length;
	        // 初始化前缀和数组
	        int[][] prefixSum = new int[n + 1][n + 1];
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n; j++) {
	                prefixSum[i][j] = prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1] + grid[i - 1][j - 1];
	            }
	        }
	        
	        // 使用二分搜索找到最大尺寸
	        int left = 0, right = n, maxSize = 0;
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            if (canFindSubGridOfSize(prefixSum, mid, maxSum)) {
	                maxSize = mid;
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return maxSize;
	    }

	    private static boolean canFindSubGridOfSize(int[][] prefixSum, int size, int maxSum) {
	        for (int i = size; i < prefixSum.length; i++) {
	            for (int j = size; j < prefixSum[i].length; j++) {
	                int sum = prefixSum[i][j] - prefixSum[i - size][j] - prefixSum[i][j - size] + prefixSum[i - size][j - size];
	                if (sum <= maxSum) {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        int[][] grid = { {2, 2, 2}, {3, 3, 3}, {4, 4, 4} };
	        int maxSum = 26; // 例子中的一个maxSum值
	        System.out.println(largestSubGrid(grid, maxSum));
	    }
	}



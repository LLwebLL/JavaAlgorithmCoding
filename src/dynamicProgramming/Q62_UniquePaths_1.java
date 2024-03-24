package dynamicProgramming;

public class Q62_UniquePaths_1 {
	// 原始：滚动数组 O(mn), O(mn)
	    public int uniquePaths_initial(int m, int n) {
	        int[][] f = new int[m][n];
	        for (int i = 0; i < m; ++i) {
	            f[i][0] = 1;
	        }
	        for (int j = 0; j < n; ++j) {
	            f[0][j] = 1;
	        }
	        for (int i = 1; i < m; ++i) {
	            for (int j = 1; j < n; ++j) {
	                f[i][j] = f[i - 1][j] + f[i][j - 1];
	            }
	        }
	        return f[m - 1][n - 1];
	    }
	
// 优化：滚动数组 O(mn), O(min(m,n))
	        public int uniquePaths(int m, int n) {
	            int[] f = new int[n];
	            for (int i = 0; i < n; ++i) {
	                f[i] = 1;
	            }
	            for (int i = 1; i < m; ++i) {
	                for (int j = 1; j < n; ++j) {
	                    f[j] += f[j - 1];
	                }
	            }
	            return f[n - 1];
	        }
	    }

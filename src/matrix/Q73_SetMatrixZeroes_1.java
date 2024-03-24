package matrix;

// Method 1: Using One Flag Array
// Time: O（mn）   ,Space: O(m+n)
public class Q73_SetMatrixZeroes_1 {
	    public void setZeroes(int[][] matrix) {
	        int m = matrix.length, n = matrix[0].length;
	        boolean[] row = new boolean[m];
	        boolean[] col = new boolean[n];
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                if (matrix[i][j] == 0) {
	                    row[i] = col[j] = true;
	                }
	            }
	        }
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                if (row[i] || col[j]) {
	                    matrix[i][j] = 0;
	                }
	            }
	        }}}

	
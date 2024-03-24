package matrix;


//Method 1: 
//Time: O（n^2）   ,Space: O(n^2)
public class Q48_RotateImage_1 {

	    public void rotate(int[][] matrix) {
	        int n = matrix.length;
	        int[][] matrix_new = new int[n][n];
	        for (int i = 0; i < n; ++i) {
	            for (int j = 0; j < n; ++j) {
	                matrix_new[j][n - i - 1] = matrix[i][j];
	            }
	        }
	        for (int i = 0; i < n; ++i) {
	            for (int j = 0; j < n; ++j) {
	                matrix[i][j] = matrix_new[i][j];}}}	         
//Method 2: 原地旋转
//Time: O（n^2）   ,Space: O(1)
	    
	        public void rotate2(int[][] matrix) {
	            int n = matrix.length;
	            for (int i = 0; i < n / 2; ++i) {
	                for (int j = 0; j < (n + 1) / 2; ++j) {
	                    int temp = matrix[i][j];
	                    matrix[i][j] = matrix[n - j - 1][i];
	                    matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
	                    matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
	                    matrix[j][n - i - 1] = temp;
	                }
	            }
	        
	    }

//Method 2: 用翻转代替旋转
//Time: O（n^2）   ,Space: O(1)
	            public void rotate3(int[][] matrix) {
	                int n = matrix.length;
	                // 水平翻转
	                for (int i = 0; i < n / 2; ++i) {
	                    for (int j = 0; j < n; ++j) {
	                        int temp = matrix[i][j];
	                        matrix[i][j] = matrix[n - i - 1][j];
	                        matrix[n - i - 1][j] = temp;
	                    }
	                }
	                // 主对角线翻转
	                for (int i = 0; i < n; ++i) {
	                    for (int j = 0; j < i; ++j) {
	                        int temp = matrix[i][j];
	                        matrix[i][j] = matrix[j][i];
	                        matrix[j][i] = temp;
	                    }
	                }
	            }

}
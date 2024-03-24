package sortingAndSearching;



// method 1 : Binary search
// time: O(log⁡mn), space: O(1);

public class Q74_Searcha2DMatrix_1 {
	    public boolean searchMatrix(int[][] matrix, int target) {
	        int m = matrix.length, n = matrix[0].length;
	        int low = 0, high = m * n - 1;
	        while (low <= high) {
	            int mid = (high - low) / 2 + low;
	            int x = matrix[mid / n][mid % n];
	            if (x < target) {
	                low = mid + 1;
	            } else if (x > target) {
	                high = mid - 1;
	            } else {
	                return true;
	            }
	        }
	        return false;
	    }
	}


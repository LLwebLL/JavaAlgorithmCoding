package sortingAndSearching;

public class Q240_Searcha2DMatrixII_1 {
	class Solution {
	    public boolean searchMatrix(int[][] matrix, int target) {
	        for(int[] nums: matrix){
	            int x=dfs(nums,  target);
	            if(x>0) return true;
	        }
	        return false;
	    }
	    public int dfs(int[] nums, int target){
	        int n=nums.length, l=0;
	        int r=n-1;
	        while(l<=r){
	            int m =l+(r-l)/2;
	            if(nums[m]==target) return 1;
	            else if(nums[m]>target) r=m-1;
	            else l=m+1;
	        }
	        return -1;
	    }
	}
}

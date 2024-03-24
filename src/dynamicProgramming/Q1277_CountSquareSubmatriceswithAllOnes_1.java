package dynamicProgramming;

public class Q1277_CountSquareSubmatriceswithAllOnes_1 {
	  public int countSquares(int[][] matrix) {
	        int  rows=matrix.length, cols= matrix[0].length,ans=0;
	        int[][]dp = new int[rows][cols];
	        for(int r=0;r<rows;r++){
	            for(int c=0;c<cols;c++){
	               if (r == 0 || c == 0) {
	                    dp[r][c] = matrix[r][c];
	                }
	                else if (matrix[r][c] == 0) {
	                    dp[r][c] = 0;
	                }
	                else dp[r][c]=Math.min(Math.min(dp[r-1][c],dp[r][c-1]),dp[r-1][c-1])+1;
	               
	               
	                ans+=dp[r][c];
	                 }
	            } 
	        return ans;
	    }
	}



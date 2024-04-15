package matrix;

public class Q79_Word_Search_1 {
	//O(MN⋅3L)，O(MN) DFS
	class Solution {
	    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
	    public boolean exist(char[][] board, String word) {
	    	int r = board.length, c = board[0].length;  
	        boolean[][] v = new boolean[r][c];
	        for (int i = 0; i < r; i++) {
	        	for (int j = 0; j < c; j++) {
	        		if( dfs(board,v, i,j, word,0)) return true;
	            }
	        }
	        return false;
	    }
	    public boolean dfs(char[][] board,boolean[][] v,int i, int j, String s, int index){
	        if (board[i][j]!= s.charAt(index)) return false;
	        else if (index == s.length()-1) return true;
	        v[i][j]=true;
	        boolean result = false;
	        for(int[] d: directions){
	            int newi = i+d[0],  newj = d[1]+j;
	            if(newi>=0&& newi<board.length&&newj>=0&& newj<board[0].length&&!v[newi][newj]){
	                    if(dfs(board,v,newi,newj,s,index+1)){
	                         result=true;
	                         break; 
	                    }
	            }
	        } 
	       v[i][j]=false;
	       return result;
	    }
	}
}




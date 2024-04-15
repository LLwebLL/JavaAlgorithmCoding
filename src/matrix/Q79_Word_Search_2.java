package matrix;

public class Q79_Word_Search_2 {
	//O(MN⋅3L)，O(MN) DFS
	class Solution {
	    public boolean exist(char[][] board, String word) {
	        int n = board.length;
	        int m = board[0].length;
	        boolean[][] visited = new boolean[n][m];
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                if (board[i][j] == word.charAt(0)) {
	                    if (dfs(board, word, i, j, 0, visited)) {
	                        return true;
	                    }
	                }
	            }
	        }
	        return false;
	    }

	    public boolean dfs(char[][] board, String word, int row, int col, int index, boolean[][] visited) {
	        if (index == word.length()) {
	            return true;
	        }

	        if (row < 0 || row >= board.length || col < 0 || col >= board[row].length 
	            || board[row][col] != word.charAt(index) || visited[row][col] == true) {
	                return false;
	            }

	        visited[row][col] = true;
	        boolean nextChar = dfs(board, word, row + 1, col, index + 1, visited)
	                        || dfs(board, word, row - 1, col, index + 1, visited)
	                        || dfs(board, word, row, col + 1, index + 1, visited)
	                        || dfs(board, word, row, col - 1, index + 1, visited);

	        visited[row][col] = false;

	        return nextChar;
	    }
	}
}

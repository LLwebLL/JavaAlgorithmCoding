package graph;

// Method 1 : MY WORK: DFS

public class Q733_FloodFill_1 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length, n =image[0].length;
       boolean[][] visited = new boolean[m][n];
        dfs( image, sr,  sc, color,image[sr][sc], visited);
        return image;
   }
   
   public void dfs(int[][] image, int sr, int sc, int color, int initial, boolean[][] visited){
       int m = image.length, n =image[0].length;
       if(sr >=m||sc>=n|| sr<0||sc<0||visited[sr][sc]==true||image[sr][sc] != initial) return;
           visited[sr][sc] = true; 
            initial = image[sr][sc];
            image[sr][sc] = color; 
            dfs(image, sr+1,  sc,  color,initial,visited);
            dfs(image, sr-1,  sc,  color,initial,visited);
            dfs(image, sr,  sc+1,  color,initial,visited);
            dfs(image, sr,  sc-1,  color,initial,visited);
       }
   }

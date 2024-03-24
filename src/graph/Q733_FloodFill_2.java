package graph;

public class Q733_FloodFill_2 {

	    int[] dx = {1, 0, 0, -1};
	    int[] dy = {0, 1, -1, 0};

	    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
	        int currColor = image[sr][sc];
	        if (currColor != color) {
	            dfs(image, sr, sc, currColor, color);
	        }
	        return image;
	    }

	    public void dfs(int[][] image, int x, int y, int currColor, int color) {
	        if (image[x][y] == currColor) {
	            image[x][y] = color;
	            for (int i = 0; i < 4; i++) {
	                int mx = x + dx[i], my = y + dy[i];
	                if (mx >= 0 && mx < image.length && my >= 0 && my < image[0].length) {
	                    dfs(image, mx, my, currColor, color);
	                }
	            }
	        }
	    }

	    public int[][] floodFill_final(int[][] image, int sr, int sc, int color) {
	        int now = image[sr][sc];      
	         if(now!=color)   dfs(color,now,image,sr,sc);
	        return image;
	    }
	    public void dfs(int newcolor, int now, int[][] image, int r,int c){
	        if(r<0||c<0||r>=image.length||c>=image[0].length||image[r][c]!=now) return;
	        image[r][c]=newcolor;
	        dfs(newcolor,now,image,r+1,c);
	                dfs(newcolor,now,image,r-1,c);
	                        dfs(newcolor,now,image,r,c+1);
	                                dfs(newcolor,now,image,r,c-1);
	    }
	}

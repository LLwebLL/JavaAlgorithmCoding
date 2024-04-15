package other;
import java.util.ArrayList;
import java.util.Collections;

public class SanC_minimizeCost {
	public class Solution {
	    
	    public int cost(int x, int y, int a, int b) {
	        return Math.abs(x - a) + Math.abs(y - b);
	    }

	    public int minimizeCost(int[] numPeople, int[] x, int[] y) {
	        ArrayList<Integer> xx = new ArrayList<>();
	        ArrayList<Integer> yy = new ArrayList<>();
	        int ans = 0;
	        
	        for (int i = 0; i < numPeople.length; i++) {
	            for (int j = 0; j < numPeople[i]; j++) {
	                xx.add(x[i]);
	                yy.add(y[i]);
	            }
	        }

	        Collections.sort(xx);
	        Collections.sort(yy);
	        int mx = xx.get(xx.size() / 2);
	        int my = yy.get(yy.size() / 2);

	        for (int i = 0; i < x.length; i++) {
	            ans += numPeople[i] * cost(mx, my, x[i], y[i]);
	        }

	        return ans;
	    }
	}

}

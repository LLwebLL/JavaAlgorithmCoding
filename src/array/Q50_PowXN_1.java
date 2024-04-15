package array;

public class Q50_PowXN_1 {
//O(log n) O(log n)
	class Solution {
	    public double myPow(double x, int n) {
	    	long N = n;
	    	return N>=0? recursion (x, N) : 1.0/recursion (x, -N); 
	    }
	    public double recursion(double x, long N){
	    	if(N==0) return 1.0;
	    	double y = recursion (x, N/2);
	    	return N%2==0 ? y*y : x*y*y;
	    }
	}
}
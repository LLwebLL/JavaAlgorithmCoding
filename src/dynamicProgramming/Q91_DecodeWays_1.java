package dynamicProgramming;

// method 1 :最终解法 O(n),O(1)
public class Q91_DecodeWays_1 {
	    public int numDecodings(String s) {
	        int n = s.length();
	        // a = f[i-2], b = f[i-1], c=f[i]
	        int a = 0, b = 1, c = 0;
	        for (int i = 1; i <= n; ++i) {
	            c = 0;
	            if (s.charAt(i - 1) != '0') {
	                c += b;
	            }
	            if (i > 1 && s.charAt(i - 2) != '0' && ((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') <= 26)) {
	                c += a;
	            }
	            a = b;
	            b = c;
	        }
	        return c;
	    }
	

// method 2 : 之前的解法 O(n),O(n)
    public int numDecodings_initial(String s) {
        int n = s.length();
        int[] f = new int[n + 1];
        f[0] = 1;
        for (int i = 1; i <= n; ++i) {
            if (s.charAt(i - 1) != '0') {
                f[i] += f[i - 1];
            }
            if (i > 1 && s.charAt(i - 2) != '0' && ((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') <= 26)) {
                f[i] += f[i - 2];
            }
        }
        return f[n];
    }}
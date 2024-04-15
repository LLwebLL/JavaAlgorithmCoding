package dynamicProgramming;

public class Q338_CountingBits_1 {
	class Solution {
	    public int[] countBits(int n) {
	        int[] bits = new int[n + 1];
	        for (int i = 1; i <= n; i++) {
	            bits[i] = bits[i >> 1] + (i & 1);
	        }
	        return bits;
	    }
	}
}

//0-0： contains 0 ones.
//1-1： contains 1 one.
//2-10： contains 1 one.
//3-11： contains 2 ones.
//4-100： contains 1 one.
//5-101： contains 2 ones.
//Therefore, for n = 5, the result array should be [0, 1, 1, 2, 1, 2].

package binary;

public class Q371_SumofTwoIntegers_1 {

	    public int getSum(int a, int b) {
	        while (b != 0) {
	            int carry = (a & b) << 1;
	            a = a ^ b;
	            b = carry;
	        }
	        return a;
	    }
	}

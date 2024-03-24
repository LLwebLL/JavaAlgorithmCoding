package array;

public class Q136_SingleNumber_1 {
//Bit Manipulation
	// On ,O1
    public int singleNumber(int[] nums) {
    	int rox =0;
    	for(int x: nums){
    		rox ^=x;
    	}
    	return rox;
    }
}
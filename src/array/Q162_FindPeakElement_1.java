package array;

public class Q162_FindPeakElement_1 {

	    public int findPeakElement(int[] nums) {
	        int n=nums.length, l=0, r=n-1;
	        while(l < r){ 
	            int m=(r-l)/2+l;
	            if(nums[m+1]<nums[m])
	                r = m;
	            else
	            	l=m+1;
	        }
	        return l;
	        }
}

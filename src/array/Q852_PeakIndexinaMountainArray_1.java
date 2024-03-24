package array;

public class Q852_PeakIndexinaMountainArray_1 {
	class Solution {
	    public int peakIndexInMountainArray(int[] arr) {
	        int n =arr.length, l =0;
	        int r = n-1;
	        while(l<r){
	            int m= (r-l)/2+l;
	            if(arr[m]<arr[m+1]) l=m+1;
	            else r =m;
	        }
	        return l;
	    }
	}
}

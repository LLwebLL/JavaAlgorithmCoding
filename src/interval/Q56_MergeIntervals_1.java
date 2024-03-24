package interval;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

// Method 1:  Sort 
public class Q56_MergeIntervals_1 {
	  public int[][] merge(int[][] intervals) {
		 Arrays.sort(intervals, new Comparator<int[]>(){
		    	 public int compare (int[] a, int[]b){
		    	     return a[0]-b[0];
		    	 }});
		     
		 List<int[] > ans = new ArrayList<>();
		    	 
		 for(int i=0;i<intervals.length;i++){
		    int l=intervals[i][0],r=intervals[i][1];
		    int n=ans.size();
		    	if(n==0||ans.get(ans.size()-1)[1]<l) ans.add(new int[]{l,r});
		    	 else {
		    	     ans.get(n-1)[1]=Math.max(r,ans.get(n-1)[1]);
		    	 }}
		    	 
		    	 return ans.toArray(new int [ans.size()][]);}}

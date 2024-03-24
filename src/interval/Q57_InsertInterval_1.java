package interval;

import java.util.List;
import java.util.ArrayList;

// Method 1:
//时间复杂度：O(n)    空间复杂度：O(1）
public class Q57_InsertInterval_1 {
	public int[][] insert(int[][] intervals, int[] newInterval) {
        int left = newInterval[0],right = newInterval[1];
        List<int[]> ansList= new ArrayList<>();
        boolean placed =false;
        for (int[] interval : intervals){
            if(interval[0]> right){
                if(!placed){
                    ansList.add(new int[] {left,right} );
                    placed=true;}
                ansList.add(interval);}
            
            else if (interval[1]<left){ansList.add(interval);}
            
            else{
                left = Math.min(left,interval[0]);
                right= Math.max(right,interval[1]);}}
        
            if (!placed) ansList.add(new int[] {left,right});
            int [][] ans =new int [ansList.size()][2];
            
            for (int i=0;i<ansList.size();i++){
                ans[i]=ansList.get(i);}
         
            return ans;}}
            



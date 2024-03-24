package interval;
import java.util.List;
import java.util.ArrayList;

// Method 1: 一次遍历
public class Q228_Summary_Ranges {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n=nums.length;
        int i =0;
        while(i<n){
            int low =i;
            i++;
            while(i<n&& nums[i]==nums[i-1]+1){
                i++;}
            int high = i-1;

            StringBuffer temp = new StringBuffer(Integer.toString(nums[low]));
            if (low<high){
                temp.append("->");
                temp.append(Integer.toString(nums[high]));}
                ans.add(temp.toString());
            }
        return ans;}}


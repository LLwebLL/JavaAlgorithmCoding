package array;

public class Q485_MaxConsecutiveOnes_1 {
	class Solution {
	    public int findMaxConsecutiveOnes(int[] nums) {
	        int count=0, ans=0;
	        for(int x:nums){
	            if(x==1) count++;
	            else{
	                ans=Math.max(ans,count);
	                count=0;
	            }
	        }
	        ans=Math.max(ans,count);
	        return ans;
	    }
	}}
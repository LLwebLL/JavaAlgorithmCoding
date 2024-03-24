package slidingWindow;

public class Q1493_LongestSubarrayof1sAfterDeletingOneElement_1 {
	class Solution {
	    public int longestSubarray(int[] nums) {
	        int k=1,j,i=0;
//因为容忍删除一个0所以对于本来 应该的j -i +1 才是真正的长度就不需要+1了 ，因为此时已多包含一个0
	        for( j=0;j<nums.length;j++){
	            if(nums[j]==0) k--;
	            if(k<0&&nums[i++]==0) k++;

	        }
	      //然而j-i-1而不是j-i是因为for loop之后j++哪怕不进入for loop,但此时j已经被多+1了所以要在 
	        //原先 j-i的基础上再-1 也就是 j-i-1
	        return j-i-1;
	    }
	}
}

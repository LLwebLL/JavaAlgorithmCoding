package array;

public class Q287_FindtheDuplicateNumber_1 {
	class Solution {
	    public int findDuplicate(int[] nums) {
	        int slow = 0;
	        int fast = 0;
	        slow = nums[slow];
	        fast = nums[nums[fast]];
	        while(slow != fast){
	            slow = nums[slow];
	            fast = nums[nums[fast]];
	        }
	        int pre1 = 0;
	        int pre2 = slow;
	        while(pre1 != pre2){
	            pre1 = nums[pre1];
	            pre2 = nums[pre2];
	        }
	        return pre1;
	    }
	
	    public int findDuplicate_min(int[] nums) {
	        int s = 0, f=0;
	        s= nums[s];
	        f=nums[nums[f]];
	        while(s!=f){
	              s= nums[s];
	        f=nums[nums[f]];
	        }
	        s=0;
	          while(s!=f){
	              s= nums[s];
	        f=nums[f];
	        }
	        return f;
	    }
	}}
	
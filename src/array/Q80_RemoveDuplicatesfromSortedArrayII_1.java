package array;



// Method1: Two Pointers
// Time:O(n), Space:O(1)
public class Q80_RemoveDuplicatesfromSortedArrayII_1 {
	  public int removeDuplicates(int[] nums) {
	        int n =nums.length;
	        if (n<=2) return n;
	        int slow=2,fast=2;
	        while(fast<n){
	            if(nums[slow-2]!=nums[fast]){
	                nums[slow]=nums[fast];
	                slow++;
	            }
	            fast++;
	        }
	        return slow;
	    }
	}

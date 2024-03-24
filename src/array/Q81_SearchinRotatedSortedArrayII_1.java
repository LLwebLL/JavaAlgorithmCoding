package array;

public class Q81_SearchinRotatedSortedArrayII_1 {
	 public boolean search(int[] nums, int target) {
		 int l =0, n=nums.length;
		 int r=n-1;   
		 if(n==1) return nums[0] == target;
		 while(l<=r){
			 int m =l+(r-l)/2;
			 if(nums[m]==target) return true;
			 if (nums[l] == nums[m]) {
				 l++;
				 continue;
			 }
			 if(nums[m]>=nums[l]){
				 if(target<nums[m]&&target>=nums[l]) r=m-1;
				 else l=m+1;
			 }
			 else{
				 if(nums[r]>=target&&nums[m]<target) l=m+1;
				 else r=m-1;
         }
     }
     return false;
}}
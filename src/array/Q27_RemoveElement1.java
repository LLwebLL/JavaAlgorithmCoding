package array;


// Method 1
// Time:O(n), Space:O（1)
public class Q27_RemoveElement1 {
	 public int removeElement(int[] nums, int val) {
		 int left =0;
		 for (int right= 0; right<nums.length; right++) {
			 if (nums[right]!= val) {
				 nums[left]= nums[right];
				 left++;
			 }
		 }
		 return left;
	 }


// Method 2
// Time:O(n), Space:O（1)
	public static int  removeElement2(int[] nums, int val) {	
		     int left = 0;
		        int right = nums.length;//故意用长度，而不是长度减一确保浏览更多这样后续条件不需要写left<=right了
		        while (left < right) {
		            if (nums[left] == val) {
		                nums[left] = nums[right - 1];
		                right--;
		            } else {
		                left++;  //因为到left < right，假设复制最后，right也会变小，所以不会多加left的值
		            }
		        }
		        return left;
		    }
public static void main (String[] args) {
	int [] a= new int[]{0,1,2,3,4};
	int val =2;
	System.out.println(removeElement2( a,val));
	
}
}


















	
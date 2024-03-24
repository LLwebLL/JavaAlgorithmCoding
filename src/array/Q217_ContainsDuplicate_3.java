package array;
import java.util.Arrays;


//方法三： 排序: time complexity = O(n log n)+ O(n) = O(n log n)
//O(n log n) > O(n) > O(n^2) 
public class Q217_ContainsDuplicate_3 {
	    public boolean containsDuplicate(int[] nums) {
	        Arrays.sort(nums);                // O(n log n)
	        int n = nums.length;
	        for (int i = 0; i < n - 1; i++) { // O(n)
	            if (nums[i] == nums[i + 1]) { //因为此处用了i+1,所以前面需要i<n-1
	                return true;
	            }
	        }
	        return false;
	    }
	}

	



package heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q658_FindKClosestElements_1 {
// Method1: sort 时间复杂度：O(nlog⁡n)空间复杂度：O(log⁡n)
	    public List<Integer> findClosestElements(int[] arr, int k, int x) {
	        List<Integer> list = new ArrayList<Integer>();
	        for (int num : arr) {
	            list.add(num);
	        }
	        Collections.sort(list, (a, b) -> {
	            if (Math.abs(a - x) != Math.abs(b - x)) {
	                return Math.abs(a - x) - Math.abs(b - x);
	            } else {
	                return a - b;
	            }
	        });
	        List<Integer> ans = list.subList(0, k);
	        Collections.sort(ans);
	        return ans;
	    }
	}
// Method2 :二分查找 + 双指针
// O(log⁡n+k),O(1)
class Solution2 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int right = binarySearch(arr, x);
        int left = right - 1;
        while (k-- > 0) {
            if (left < 0) {
                right++;
            } else if (right >= arr.length) {
                left--;
            } else if (x - arr[left] <= arr[right] - x) {
                left--;
            } else {
                right++;
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = left + 1; i < right; i++) {//因为之前whilek--<0最后的操作会越界的
            ans.add(arr[i]);
        }
        return ans;
    }

    public int binarySearch(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}

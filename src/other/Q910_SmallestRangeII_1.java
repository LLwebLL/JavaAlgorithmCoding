package other;

import java.util.Arrays;

public class Q910_SmallestRangeII_1 {
    public int smallestRangeII(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans= nums[n-1]- nums[0];
        for(int i =0;i<n-1;i++){
            int a = nums[i], b = nums[i+1];
            int high = Math.max(nums[n-1]-k, a+k);
            int low = Math.min(nums[0]+k, b-k);
            ans = Math.min(ans, high-low);
        }
        return ans;
    }
}


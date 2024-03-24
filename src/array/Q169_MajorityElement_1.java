package array;

import java.util.Arrays;

public class Q169_MajorityElement_1 {
//Method1:排序
	//Time: O(nlogn)排序的时间复杂程度
	// Space:O(logn)
	    public int majorityElement(int[] nums) {
	        Arrays.sort(nums);
	        return nums[nums.length / 2];
	    }
 //Method2:候选人 Time: O(n) Space:O(1)
    public int majorityElement2(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }}
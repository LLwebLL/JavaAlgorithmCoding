package array;

// Method 1: Two Pointers
// Time:O(n), Space:O(1)
public class Q26_RemoveDuplicatesfromSortedArray_1 {
    public int removeDuplicates(int[] nums) {
        int n =nums.length;
       
        int slow=1,fast=1;
        while (fast<n){
            if (nums[fast]!=nums[fast-1]) {
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;}}


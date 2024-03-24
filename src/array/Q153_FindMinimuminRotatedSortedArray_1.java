package array;
/*Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
 *  For example, the array nums = [0,1,2,4,5,6,7] might become:
 *  
[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.

Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
Given the sorted rotated array nums of unique elements, return the minimum element of this array.
You must write an algorithm that runs in O(log n) time.

Example 1:
Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.

Example 2:
Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.

Example 3:
Input: nums = [11,13,15,17]
Output: 11
Explanation: The original array was [11,13,15,17] and it was rotated 4 times.
 */

// 方法一： 二分查找 Binary Search 
public class Q153_FindMinimuminRotatedSortedArray_1 {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (nums[pivot] < nums[high]) {
                high = pivot;
            } else {
                low = pivot + 1;
            }
        }
        return nums[low];
    }
}


//初始化两个指针 low 和 high 分别指向数组的起始和结束位置。

//当 low 指针小于 high 指针时，持续执行循环：

//a. 计算中间位置 pivot。

//b. 如果 nums[pivot]（中间位置的值）小于 nums[high]（当前右边界的值），这意味着最小值在 low 到 pivot 之间，因为右边是升序的。所以将 high 移动到 pivot。

//c. 否则，最小值在 pivot+1 到 high 之间，因此将 low 移动到 pivot+1。

//当循环结束时，low 指向的就是数组中的最小值。
	
	
	
	
	
	
	
	
	
	
	



























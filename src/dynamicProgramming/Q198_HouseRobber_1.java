package dynamicProgramming;

// O(n),O(1)
public class Q198_HouseRobber_1 {
    public int rob(int[] nums) {
        if (nums.length==1) return nums[0];
        int f0 = 0, f1 = 0;
       for (int i = 0; i < nums.length; ++i) {
           int newF = Math.max(f1, f0 + nums[i]);
           f0 = f1;
           f1 = newF;
       }
       return f1;
   }

    public int rob2(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int first = nums[0], second = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }
}
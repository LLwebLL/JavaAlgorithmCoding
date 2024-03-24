package array;
import java.util.HashMap;
import java.util.Map;




//方法二：哈希表

public class Q1_TwoSum_2 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> twosum_table = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (twosum_table.containsKey(target - nums[i])) {
                return new int[]{twosum_table.get(target - nums[i]), i};
            }
            twosum_table.put(nums[i], i);//当 i = 0 时, 我们看到数字 2. 我们需要找一个数字 7 (因为 9 - 2 = 7) 以使两数之和为 9。由于我们还没有遇到 7，所以我们将 2 及其索引 0 存入哈希表。
        }
        return new int[0];
    }
public static void main(String[] args) {
	 int[] nums = {2, 5, 9, 20};
	 int target = 25;
	 int[] result = twoSum(nums,target);
	 System.out.println("the answer is:[" + result[0]+ ","+result[1]+"]");
}
}




























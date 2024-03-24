package array;

import java.util.HashSet;
import java.util.Set;

// 方法二： HashSet （time complexity = O(n)）
// 因为不需要索引位置，我们用HashSet
public class Q217_ContainsDuplicate_2 {
	public static boolean distinctNumber2(int nums[] ) {
		Set<Integer> numberSet  = new HashSet <Integer> ();
	    for (int num : nums) { // “for-each loop” 或者 “enhanced for loop”,O(n)
            if (numberSet.contains(num)) { //此处也可为： if (!numberSet.add(x)){} 因为HashSet（和所有Set实现）的定义是一个不允许重复元素的集合，
                return true;			   //所以试图向HashSet中添加一个已经存在的元素时，add方法会返回false。
            }
            numberSet.add(num);
        }
        return false;
    }
	public static void main(String[] args) {
		int [] a = {1,2,2,4,5,6};
		int [] b = {1,2,3,4,5,6};
		boolean result_a = distinctNumber2(a);
		boolean result_b = distinctNumber2(b);
		System.out.println("数组a的输出结果是"+result_a+"\n"+"数组b的输出结果是"+result_b);	
}}


package string;


// 方法二：排序 
//时间复杂度:  O(n log n) 
//空间复杂度:  O(n)

import java.util.Arrays;

public class Q242_ValidAnagram_2 {
	    public boolean isAnagram(String s, String t) {
	        if (s.length() != t.length()) {
	            return false;
	        }
	        char[] str1 = s.toCharArray();//是一个 Java 方法，它将一个 String 对象转换为一个字符数组 ->  char[]
	        char[] str2 = t.toCharArray();
	        Arrays.sort(str1);
	        Arrays.sort(str2);
	        return Arrays.equals(str1, str2);}//使用 Arrays.equals 来判断两个字符数组是否相同。
	}
//字符数组 (char[]): 可以存储字符。
//整数数组 (int[]): 可以存储整数。
//双精度数组 (double[]): 可以存储双精度浮点数。
//布尔数组 (boolean[]): 可以存储 true 或 false。
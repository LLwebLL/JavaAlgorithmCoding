package array;

public class Q135_Candy_1 {
	//方法一：两次遍历 On On
	    public int candy(int[] ratings) {
	        int n = ratings.length;
	        int[] left = new int[n];
	        for (int i = 0; i < n; i++) {
	            if (i > 0 && ratings[i] > ratings[i - 1]) {
	                left[i] = left[i - 1] + 1;
	            } else {
	                left[i] = 1;
	            }
	        }
	        int right = 0, ret = 0;
	        for (int i = n - 1; i >= 0; i--) {
	            if (i < n - 1 && ratings[i] > ratings[i + 1]) {
	                right++;
	            } else {
	                right = 1;
	            }
	            ret += Math.max(left[i], right);
	        }
	        return ret;
	    }
	
//方法二：常数空间遍历
class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int ret = 1;
        int inc = 1, dec = 0, pre = 1;
        for (int i = 1; i < n; i++) {
            if (ratings[i] >= ratings[i - 1]) {
                dec = 0;
                pre = ratings[i] == ratings[i - 1] ? 1 : pre + 1;
                ret += pre;
                inc = pre;
            } else {
                dec++;
                if (dec == inc) {
                    dec++;
                }
                ret += dec;
                pre = 1;
            }
        }
        return ret;
    }
}}


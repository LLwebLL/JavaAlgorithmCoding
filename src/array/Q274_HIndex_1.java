package array;

import java.util.Arrays;

public class Q274_HIndex_1 {
//Method1: 排序 O(nlogn), O(logn)
	    public int hIndex1(int[] citations) {
	        Arrays.sort(citations);
	        int h = 0, i = citations.length - 1; 
	        while (i >= 0 && citations[i] > h) {
	            h++; 
	            i--;
	        }
	        return h;
	    }

//Method2:Counting Sort O(n) O(n)

    public int hIndex(int[] citations) {
        int n = citations.length, tot = 0;
        int[] counter = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (citations[i] >= n) {
                counter[n]++;
            } else {
                counter[citations[i]]++;
            }
        }
        for (int i = n; i >= 0; i--) {
            tot += counter[i];
            if (tot >= i) {
                return i;
            }
        }
        return 0;
    }
}

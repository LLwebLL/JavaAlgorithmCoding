package string;

import java.util.HashSet;
import java.util.Set;

public class Q2405_OptimalPartitionofString_1 {
	 public int partitionString(String s) {
	    int count = 1;
	    Set<Character> set = new HashSet<Character>();
	    int length = s.length();
	    for (int i = 0; i < length; i++) {
	        char c = s.charAt(i);
	        if (set.contains(c)) {
	            count++; 
	            set.clear();
	        }
	        set.add(c);
	    }
	    return count;
	}

}

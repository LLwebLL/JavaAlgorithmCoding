package array;

import java.util.HashMap;
import java.util.Map;
public class Q13_RomantoInteger_1 {
// On O1
	  Map<Character, Integer> symbolValues = Map.ofEntries(
	            Map.entry('I', 1),
	            Map.entry('V', 5),
	            Map.entry('X', 10),
	            Map.entry('L', 50),
	            Map.entry('C', 100),
	            Map.entry('D', 500),
	            Map.entry('M', 1000)
	    );
	  //以下这种写法也可以
	  Map<Character, Integer> x = new HashMap<>();

	    {
	        x.put('I', 1);
	        x.put('V', 5);
	        x.put('X', 10);
	        x.put('L', 50);
	        x.put('C', 100);
	        x.put('D', 500);
	        x.put('M', 1000);
	    }

	    public int romanToInt(String s) {
	        int ans = 0;
	        int n = s.length();
	        for (int i = 0; i < n; ++i) {
	            int value = symbolValues.get(s.charAt(i));
	            if (i < n - 1 && value < symbolValues.get(s.charAt(i + 1))) {
	                ans -= value;
	            } else {
	                ans += value;
	            }
	        }
	        return ans;
	    }
	}


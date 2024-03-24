package other;

import java.util.HashMap;
import java.util.Map;

public class Q974_SubarraySumsDivisiblebyK_1 {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> table = new HashMap<>();
        int sum=0,ans=0;
        table.put(0,1);
        for(int x :nums){
            sum+=x;
            int module = (sum%k +k)%k;
            int same = table.getOrDefault(module,0);
            ans+=same;
            table.put(module, same+1);
        }
        return ans;
    }
}


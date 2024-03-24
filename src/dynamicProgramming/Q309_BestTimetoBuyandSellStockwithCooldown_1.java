package dynamicProgramming;

public class Q309_BestTimetoBuyandSellStockwithCooldown_1 {
    public int maxProfit(int[] prices) {
        int n =prices.length;
        int f0=-prices[0], f1=0,f2=0;
        for(int i=1;i<n;i++){
            int newf0= Math.max(f0,f2-prices[i]);
            int newf1=prices[i]+f0;
            int newf2= Math.max(f2,f1);
            f0=newf0;
            f1=newf1;
            f2=newf2;
        }
        return Math.max(f1,f2);
    }
}
class Solution309 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int n = prices.length;
        // dp[i][0]: 第i天结束时，持有股票时的最大收益。
        // dp[i][1]: 第i天结束时，不持有股票且明天不可以购买股票时，最大收益。 
        // dp[i][2]: 第i天结束时，不持有股票且明天可以购买股票时，最大收益
        int[][] f = new int[n][3];
        f[0][0] = -prices[0];
        for (int i = 1; i < n; ++i) {
            f[i][0] = Math.max(f[i - 1][0], f[i - 1][2] - prices[i]);
            f[i][1] = f[i - 1][0] + prices[i];
            f[i][2] = Math.max(f[i - 1][1], f[i - 1][2]);
        }
        return Math.max(f[n - 1][1], f[n - 1][2]);
    }
}
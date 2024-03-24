package array;


// Method 1: mine
//O(n),O(1)
public class Q122_BestTimetoBuyandSellStockII_1 {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
	        int profit = 0,finalPro=0;
	        for (int i = 0; i < prices.length; i++) {
	            if (prices[i] < minprice) {
	                minprice = prices[i];
	            } else if (prices[i] - minprice > profit) {
                     profit= prices[i] - minprice;
                     finalPro+=profit;
                     profit=0;
                      minprice = prices[i];
	            }
	        }
	        return finalPro;
 }
}


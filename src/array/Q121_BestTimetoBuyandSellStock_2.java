package array;


// 方法二：（time complexity = O(n)）
public class Q121_BestTimetoBuyandSellStock_2 {
	  public int maxProfit(int [] prices) {
	        int minprice = Integer.MAX_VALUE;
	        int maxprofit = 0;
	        for (int i = 0; i < prices.length; i++) {
	            if (prices[i] < minprice) {
	                minprice = prices[i];
	            } else if (prices[i] - minprice > maxprofit) {
	                maxprofit = prices[i] - minprice;
	            }
	        }
	        return maxprofit;
	    }
}
//即 找到找到最低价格并且假设就在此时买入，之后里面最高的profit是哪个点，注意这边用了
// else if 而不是之前办法的继续j loop，因为是在找到最低点之后继续往前看的，因为存在一种情况是
// 最高的price可能在最低价格前面

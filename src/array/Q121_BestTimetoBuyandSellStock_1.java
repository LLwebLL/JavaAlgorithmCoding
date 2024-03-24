package array;
/*121. Best Time to Buy and Sell Stock

 * You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * Input: prices = [7,1,5,3,6,4], Output: 5
 * Input: prices = [7,6,4,3,1], Output: 0
 * 
 * 
 */
// 方法一：暴解 （）
public class Q121_BestTimetoBuyandSellStock_1 {
	public static int maxprofit(int[] prices) {
		int max_profit=0;
		for(int i=0; i<prices.length;i++) {
			for(int j=0;j<prices.length;j++) {
				int profit = prices[j]- prices[i];
				if (profit > max_profit) {max_profit = profit;}
			}}return  max_profit;}
	
	public static void main(String[] args) {
		int [] stock_price= {2,33,45,3,643,43,1,35,9,3};
		int result = maxprofit(stock_price);
		System.out.println(result);
	}
}

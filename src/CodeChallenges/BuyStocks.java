package CodeChallenges;

public class BuyStocks {
    public int maxProfit(int[] prices){
        int maxProfit = 0;
        int i = 0;
        int j = 1;

        while( j < prices.length){
            if(prices[j] > prices[i]){
                maxProfit = Math.max(maxProfit,prices[j]-prices[i]);
            }
            else{
                i = j;
            }
            j++;
        }
        return maxProfit;
    }
}
























/**int mini = prices[0];
 int profit = 0;
 for (int i = 1; i<prices.length; i++){
 int  cost = prices[i] - mini;
 profit = Math.max(profit,cost);
 mini = Math.min(mini,prices[i]);
 }
 return profit;**/

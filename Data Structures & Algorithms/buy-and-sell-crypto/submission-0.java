class Solution {
    public int maxProfit(int[] prices) {

        int buy = prices[0];
        int sell = 0 ;
        int profit = 0 ;
        int maxProfit = 0 ;

        for ( int i = 1 ; i < prices.length ; i++ )
        {
            sell = prices[i];

            profit = sell - buy ;

            maxProfit = Math.max(profit,maxProfit);

            buy = Math.min(buy,prices[i]);
        }

        return maxProfit ;
    }
}

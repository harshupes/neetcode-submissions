class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        int low = 0;
        int buy = prices[0];

        int sell = 0;
        int profit = 0;
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {

            // Find the lowest buying price
            buy = Math.min(buy, prices[i]);

            // Current selling price
            sell = prices[i];

            // Calculate profit
            profit = sell - buy;

            // Store maximum profit
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
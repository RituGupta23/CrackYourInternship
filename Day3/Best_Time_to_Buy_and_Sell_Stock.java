class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxprofit = Integer.MIN_VALUE;
     
        for (int i = 1; i<prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            }
            int profit = prices[i] - buy;
            maxprofit = Math.max(profit, maxprofit);
        }

        if (maxprofit < 0) {
            return 0;
        }

        return maxprofit;
    }
}
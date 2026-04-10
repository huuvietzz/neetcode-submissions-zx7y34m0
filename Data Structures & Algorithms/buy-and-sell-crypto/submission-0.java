class Solution {
    public int maxProfit(int[] prices) {
        int res = -1;
        for(int i = 0; i < prices.length; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                if(prices[j] > prices[i]) {
                    res = Math.max(res, prices[j] - prices[i]);
                }
            }
        }
        return res == -1 ? 0 : res;
    }
}

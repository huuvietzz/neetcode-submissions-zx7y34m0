class Solution {
    public int maxProfit(int[] prices) {
        int L = 0, R = 0, res = 0;
        while(R < prices.length) {
            if(prices[L] < prices[R]) {
                res = Math.max(res, prices[R] - prices[L]);
            }
            else {
                L = R;
            }
            ++R;
        }
        return res;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int L = 0, R = 0, res = 0;
        while(R < prices.length) {
            if(prices[R] <= prices[L]) {
                L = R;
                R = L + 1;
            }
            else {
                res = Math.max(res, prices[R] - prices[L]);
                ++R;
            }
        }
        return res;
    }
}

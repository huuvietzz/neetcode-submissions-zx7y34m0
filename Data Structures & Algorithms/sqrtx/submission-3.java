class Solution {
    public int mySqrt(int x) {
        int l = 0, r = x, res = -1;
        while(l <= r) {
            int mid = l + (r - l) / 2;
            long t = 1l * mid * mid;
            if(t <= x) {
                res = mid;
                l = mid + 1;
            }
            else r = mid - 1;
        }
        return res;
    }
}

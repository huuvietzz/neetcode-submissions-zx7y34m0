class Solution {
    public int maxArea(int[] heights) {
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < heights.length; i++) {
            for(int j = i + 1; j < heights.length; j++) {
                int S = (j - i) * Math.min(heights[i], heights[j]);
                res = Math.max(res, S);
            }
        }
        return res;
    }
}

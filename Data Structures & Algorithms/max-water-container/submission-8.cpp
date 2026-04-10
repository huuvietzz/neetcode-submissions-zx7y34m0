class Solution {
public:
    int maxArea(vector<int>& heights) {
       int res = -1, l = 0, r = heights.size() - 1;
       while(l < r) {
            int S = (r - l) * min(heights[l], heights[r]);
            res = max(res, S);
            if(heights[l] <= heights[r]) ++l;
            else --r;
       }
       return res;
    }
};

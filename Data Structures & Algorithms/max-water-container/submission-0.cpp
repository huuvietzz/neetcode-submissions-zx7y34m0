class Solution {
public:
    int maxArea(vector<int>& heights) {
        int res = INT_MIN;
        for(int i = 0; i < heights.size(); i++) {
            for(int j = i + 1; j < heights.size(); j++) {
                int S = (j - i) * min(heights[i], heights[j]);
                res = max(res, S);
            }
        }
        return res;
    }
};

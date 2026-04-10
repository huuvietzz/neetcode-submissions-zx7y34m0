class Solution {
public:
    int maxArea(vector<int>& heights) {
       vector<pair<int,int>> v;
       for(int i = 0; i < heights.size(); i++) {
            v.push_back({heights[i], i});
       }
       int res = -1, l = 0, r = heights.size() - 1;
       while(l < r) {
            int S = (v[r].second - v[l].second) * min(v[l].first, v[r].first);
            res = max(res, S);
            if(v[l].first <= v[r].first) ++l;
            else --r;
       }
       return res;
    }
};

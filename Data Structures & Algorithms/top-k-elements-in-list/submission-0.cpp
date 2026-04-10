class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int,int> mp;
        for(int x : nums) mp[x]++;
        vector<pair<int,int>> v(mp.begin(), mp.end());
        sort(v.begin(), v.end(), [](auto p1, auto p2) {
            return p1.second > p2.second;
        });
        vector<int> res;
        for(int i = 0; i < k; i++) {
            res.push_back(v[i].first);
        }
        return res;
    }
};

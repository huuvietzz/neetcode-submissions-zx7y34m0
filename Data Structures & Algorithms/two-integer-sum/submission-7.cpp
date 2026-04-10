class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<pair<int,int>> v;
        for(int i = 0; i < nums.size(); i++) {
            v.push_back({nums[i], i});
        }
        sort(v.begin(), v.end());
        for(int i = 0; i < v.size(); i++) {
            int l = 0, r = v.size() - 1;
            while(l < r) {
                int x = v[l].first + v[r].first;
                if(x == target) {
                    if(v[l].second > v[r].second) {
                        swap(v[l].second, v[r].second);
                    }
                    return {v[l].second, v[r].second};
                }
                else if(x > target) {
                    --r;
                }
                else {
                    ++l;
                }
            }
        }
        return {};
    }
};

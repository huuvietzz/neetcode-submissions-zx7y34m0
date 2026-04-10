class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        int n = nums.size();
        int t = n / 3;
        unordered_map<int, int> mp;
        vector<int> res;
        for(int x : nums) mp[x]++;
        for(auto it : mp) {
            if(it.second > t) {
                res.push_back(it.first);
            }
        }
        return res;
    }
};
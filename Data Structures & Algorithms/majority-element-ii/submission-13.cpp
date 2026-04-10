class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        vector<int> res;
        unordered_map<int, int> mp;
        for(int num : nums) mp[num]++;
        for(auto it : mp) {
           if(it.second > nums.size() / 3) {
              res.push_back(it.first);
           }
        }
        return res;
    }
};
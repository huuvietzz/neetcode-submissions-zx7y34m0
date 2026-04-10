class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        unordered_map<int, int> cnt;
        for(int i = 0; i < nums.size(); i++) {
            cnt[nums[i]] = i;
        }
        
        vector<vector<int>> res;
        for(int i = 0; i < nums.size(); i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i + 1; j < nums.size(); j++) {
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;
                int target = -(nums[i] + nums[j]);
                if(cnt.count(target) && cnt[target] > j) {
                    res.push_back({nums[i], nums[j], target});
                }
            }
        }
        return res;
    }
};

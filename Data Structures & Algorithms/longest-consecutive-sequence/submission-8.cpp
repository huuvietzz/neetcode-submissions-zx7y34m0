class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.empty()) return 0;
        sort(nums.begin(), nums.end());
        int dem = 1, res = INT_MIN;
        for(int i = 1; i < nums.size(); i++) {
            if(nums[i] == nums[i - 1]) continue;
            
            if(nums[i] - nums[i - 1] == 1) {
                ++dem;
            }
            else {
                res = max(res, dem);
                dem = 1;
            }
        }
        res = max(res, dem);
        return res;
    }
};





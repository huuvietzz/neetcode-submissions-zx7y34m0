class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.empty()) return 0;
        sort(nums.begin(), nums.end());
        int res = -1, dem = 1;
        for(int i = 1; i < nums.size(); i++) {
            if(nums[i] == nums[i - 1]) continue;
            if(nums[i] - nums[i - 1] == 1) ++dem;
            else {
                res = max(res, dem);
                dem = 1;
            }
        }
        res = max(res, dem);
        return res;
    }
}; 

class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.empty()) return 0;
        sort(nums.begin(), nums.end());
        int dem = 1, res = INT_MIN;
        for(int i = 1; i < nums.size(); i++) {
            if(nums[i] - nums[i - 1] == 1) ++dem;
            else if(nums[i] == nums[i - 1]) continue;
            else {
                res = max(res, dem);
                dem = 1;
            }
        }
        res = max(res, dem);
        return res;
    }
};

// 9,1,4,7,3,-1,0,5,8,-1,6   ---> 7

// -1 -1 0 1 3 4 5 6 7 8 9

// nums=[2,20,4,10,3,4,5]

// 2 3 4 4 5 10 20





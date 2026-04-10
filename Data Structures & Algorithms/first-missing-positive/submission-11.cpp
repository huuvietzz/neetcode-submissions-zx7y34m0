class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int res = 1;
        for(int num : nums) {
            if(num > 0 && res == num) {
                res++;
            }
        }
        return res;
    }
};
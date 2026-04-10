class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> se(nums.begin(), nums.end());
        int res = 0;
        for(int num : nums) {
            if(se.find(num - 1) == se.end()) {
                int len = 1;
                while(se.find(num + len) != se.end()) {
                    ++len;
                }
                res = max(res, len);
            }
        }
        return res;
    }
}; 

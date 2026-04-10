class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        unordered_set<int> se(nums.begin(), nums.end());
        int l = INT_MAX, r = INT_MIN;
        for(int x : nums) {
            r = max(r, x);
        }
        if(r <= 0) return 1;
        int ok = 0;
        for(int i = 1; i <= r; i++) {
            if(se.find(i) == se.end()) {
                ok = 1;
                return i;
            }
        }
        if(!ok) return r + 1;
    }
};
class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        unordered_set<int> se(nums.begin(), nums.end());
        int r = *max_element(nums.begin(), nums.end());
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
class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_set<int> se(nums.begin(), nums.end());
        return se.size() != nums.size();
    }
};
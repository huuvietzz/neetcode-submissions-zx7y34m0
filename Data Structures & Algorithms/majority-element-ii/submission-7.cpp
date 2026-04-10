class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        unordered_set<int> se;
        for(int i = 0; i < nums.size(); i++) {
            int cnt = 0;
            for(int j = 0; j < nums.size(); j++) {
                if(nums[i] == nums[j]) ++cnt;
            }
            if(cnt > nums.size() / 3) se.insert(nums[i]);
        }
        vector<int> res(se.begin(), se.end());
        return res;
    }
};
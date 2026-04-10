class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        vector<int> res;
        for(int num : nums) {
           if(num != val) res.push_back(num);
        }
        nums.assign(res.begin(), res.end());
        return res.size();
    }
};
class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        unordered_set<int> res;
        for(int num : nums) {
            int cnt = 0;
            for(int i : nums) {
                if(i == num) ++cnt;
            }
            if(cnt > nums.size() / 3) {
                res.insert(num);
            }
        }
        return vector<int>(res.begin(), res.end());
    }
};
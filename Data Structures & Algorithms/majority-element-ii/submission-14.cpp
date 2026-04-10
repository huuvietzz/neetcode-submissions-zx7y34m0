class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
         unordered_set<int> se;
         for(int i : nums) {
            int cnt = 0;
            for(int j : nums) {
                if(i == j) ++cnt;
            }
            if(cnt > nums.size() / 3) {
               se.insert(i);
            }
         }
         return vector<int> (se.begin(), se.end());
    }
};
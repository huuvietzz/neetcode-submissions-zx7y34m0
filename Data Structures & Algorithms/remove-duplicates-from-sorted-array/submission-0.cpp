class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        unordered_set<int> se;
        int k = 0;
        for(int num : nums) {
            if(se.find(num) == se.end()) {
                nums[k++] = num;
                se.insert(num);
            }
        }
        return k;
    }
};
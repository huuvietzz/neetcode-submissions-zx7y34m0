class Solution {
public:
    void sortColors(vector<int>& nums) {
        vector<int> cnt(3);
        for(int num : nums) {
            cnt[num]++;
        }
        int idx = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < cnt[i]; j++) {
                nums[idx++] = i;
            }
        }
    }
};

// 0 1
// 1 2 
// 2 1
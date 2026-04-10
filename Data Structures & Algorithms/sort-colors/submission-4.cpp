class Solution {
public:
    void sortColors(vector<int>& nums) {
        vector<int> cnt(3);
        for(int num : nums) {
            cnt[num]++;
        }
        int idx = 0;
        for(int i = 0; i < 3; i++) {
            while(cnt[i]-- > 0) {
                nums[idx++] = i;
            }
        }
    }
};
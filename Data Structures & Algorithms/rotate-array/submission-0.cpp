class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        k %= nums.size();
        lat(nums, 0, nums.size() - 1);
        lat(nums, 0, k - 1);
        lat(nums, k, nums.size() - 1);
    }

    void lat(vector<int> &v, int l, int r) {
        while(l < r) {
            swap(v[l++], v[r--]);
        }
    }
};

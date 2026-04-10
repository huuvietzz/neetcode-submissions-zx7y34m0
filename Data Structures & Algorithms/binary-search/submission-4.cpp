class Solution {
public:
    int binary_search(int l, int r, vector<int>& nums, int target) {
        if(l > r) return -1;
        int mid = l + (r - l) / 2;
        if(nums[mid] == target) return mid;
        return (nums[mid] > target) ? 
                binary_search(l, mid - 1, nums, target)
                : binary_search(mid + 1, r, nums, target);
    }

    int search(vector<int>& nums, int target) {
        return binary_search(0, nums.size() - 1, nums, target);
    }
};

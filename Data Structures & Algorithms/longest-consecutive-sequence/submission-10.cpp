class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> se(nums.begin(), nums.end());
        int maxLen = 0;
        for(int num : nums) {
            // Kiểm tra xem num có phải là số bắt đầu của dãy
            if(se.find(num - 1) == se.end()) {  
                int len = 1;
                // Đếm độ dài dãy liên tiếp
                while(se.find(num + len) != se.end()) {
                    ++len;
                }
                maxLen = max(maxLen, len);
            }
        }
        return maxLen;
    }
};


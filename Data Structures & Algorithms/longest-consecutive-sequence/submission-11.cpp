class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_map<int, int> mp; // Lưu số và độ dài dãy liên tiếp chứa số đó
        int res = 0; // Lưu độ dài dãy liên tiếp dài nhất

        for (int num : nums) {
            if (!mp[num]) { // Nếu num chưa được xử lý
                // Tính độ dài dãy liên tiếp chứa num
                mp[num] = mp[num - 1] + mp[num + 1] + 1;
                // Cập nhật độ dài tại điểm đầu và cuối của dãy
                mp[num - mp[num - 1]] = mp[num];
                mp[num + mp[num + 1]] = mp[num];
                // Cập nhật kết quả lớn nhất
                res = max(res, mp[num]);
            }
        }
        return res;
    }
};
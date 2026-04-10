class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        int n1 = s1.size(), n2 = s2.size();
        if(n1 > n2) return false;

        map<char, int> mp1, mp2;
        for(char c : s1) mp1[c]++;
        for(int i = 0; i < n1; i++) mp2[s2[i]]++;

        if(mp1 == mp2) return true;

        for(int i = n1; i < n2; i++) {
            mp2[s2[i]]++; // thêm

            mp2[s2[i - n1]]--; // bỏ
            if(mp2[s2[i - n1]] == 0) {
                mp2.erase(s2[i - n1]); // 🔥 QUAN TRỌNG
            }

            if(mp1 == mp2) return true;
        }
        return false;
    }
};
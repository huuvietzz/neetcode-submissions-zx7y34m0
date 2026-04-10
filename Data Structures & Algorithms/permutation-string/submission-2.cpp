class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        int n1 = s1.size(), n2 = s2.size();
        if(n1 > n2) return false;

        vector<int> cnt1(26, 0);
        for(char c : s1) cnt1[c - 'a']++;

        for(int i = 0; i <= n2 - n1; i++) {
            vector<int> cnt2(26, 0);
            for(int j = i; j < i + n1; j++) {
                cnt2[s2[j] - 'a']++;
            }
            if(cnt1 == cnt2) return true;
        }
        return false;
    }
};

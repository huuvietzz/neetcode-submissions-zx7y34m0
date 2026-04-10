class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        unordered_map<char, int> mp1;
        int n1 = s1.size(), n2 = s2.size();
        if(n1 > n2) return false;

        for(char c : s1) mp1[c]++;

        for(int i = 0; i <= n2 - n1; i++) {
            unordered_map<char, int> mp2;
            for(int j = i; j < i + n1; j++) {
                mp2[s2[j]]++;
            }

            if(mp1 == mp2) return true;
        }

        return false;
    }
};

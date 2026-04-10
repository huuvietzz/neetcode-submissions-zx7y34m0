class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int res = 0;
        for(int i = 0; i < s.size(); i++) {
            unordered_set<char> se;
            for(int j = i; j < s.size(); j++) {
                if(se.find(s[j]) != se.end()) break;
                se.insert(s[j]);
            }
            res = max(res, (int)(se.size()));
        }
        return res;
    }
};

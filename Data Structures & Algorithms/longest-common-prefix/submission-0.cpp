class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        int minLen = INT_MAX;
        for(string s : strs) {
             minLen = min(minLen, (int)s.size());
        }
        string res = "";
        for(int j = 0; j < minLen; j++) {
            unordered_set<char> se;
            for(int i = 0; i < strs.size(); i++) {
                se.insert(strs[i][j]);
            }         
            if(se.size() == 1) {
                res += *se.begin();
            }
            else {
                break;
            }
        }
        return res;
    }
};



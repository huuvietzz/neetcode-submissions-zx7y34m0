class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map<string, vector<string>> mp;
        for(const string& s : strs) {
            int cnt[26] = {0};
            for(char x : s) cnt[x - 'a']++;
            string key = "";
            for(int i = 0; i < 26; i++) {
                key += to_string(cnt[i]) + ",";
            }
            mp[key].push_back(s);
        }
        vector<vector<string>> res;
        for(auto it : mp) {
            res.push_back(move(it.second));
        }
        return res;
    }
};

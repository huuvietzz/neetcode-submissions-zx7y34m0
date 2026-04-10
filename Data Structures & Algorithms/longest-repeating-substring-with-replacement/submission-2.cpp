class Solution {
public:
    int characterReplacement(string s, int k) {
        int ans = 0;
        for(int i = 0; i < s.size(); i++) {
            unordered_map<char, int> mp;
            int maxFreq = 0;

            for(int j = i; j < s.size(); j++) {
                mp[s[j]]++;
                maxFreq = max(maxFreq, mp[s[j]]);

                int size = j - i + 1;
                if(size - maxFreq <= k) {
                    ans = max(ans, size);
                }
            }
        }
        return ans;
    }
};





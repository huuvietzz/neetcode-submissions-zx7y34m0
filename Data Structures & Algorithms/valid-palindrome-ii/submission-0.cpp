class Solution {
public:
    bool validPalindrome(string s) {
        for(int i = 0; i < s.size(); i++) {
            char tmp = s[i];
            s.erase(i, 1);
            if(check(s)) return true;
            s.insert(i, string(1, tmp));
        }
        return false;
    }

    bool check(string s) {
        return s == string(rbegin(s), rend(s));
    }
};

// abbda
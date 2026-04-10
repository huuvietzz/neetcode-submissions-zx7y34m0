class Solution {
public:
    bool isPalindrome(string s) {
        string res = "";
        for(char x : s) {
            x = tolower(x);
            if(isalnum(x)) res += x;
        }
        string rev = res;
        reverse(rev.begin(), rev.end());
        return res == rev;
    }
};

class Solution {
public:
    bool isPalindrome(string s) {
       string res = "";
       for(char x : s) {
            if(isalnum(x)) {
                res += tolower(x);
            }
       }
       return res == string(res.rbegin(), res.rend());
    }
};

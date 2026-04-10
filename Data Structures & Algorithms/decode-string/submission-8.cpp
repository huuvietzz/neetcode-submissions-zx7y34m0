class Solution {
public:
    string decodeString(string s) {
        vector<string> stringStack;
        vector<int> countStack;

        int k = 0;
        string res = "";
        for(char c : s) {
            if(isdigit(c)) {
                k = k * 10 + c - '0';
            }
            else if(c == '[') {
                stringStack.push_back(res);
                countStack.push_back(k);
                res = "";
                k = 0;
            }
            else if(c == ']') {
                string tmp = res;
                int cnt = countStack.back();
                countStack.pop_back();
                res = stringStack.back();
                stringStack.pop_back();
                for(int i = 0; i < cnt; i++) {
                    res += tmp;
                }
            }
            else {
                res += c;
            }
        }
        return res;
    }
};
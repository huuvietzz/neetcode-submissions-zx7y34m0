class Solution {
public:
    string simplifyPath(string path) {
        vector<string> st;
        string cur;
        stringstream ss(path);
        while(getline(ss, cur, '/')) {
            if(cur.empty()) continue;
            if(cur == "..") {
                if(!st.empty()) st.pop_back();
            }
            else if(!cur.empty() && cur != ".") {
                st.push_back(cur);
            }
        }

        string res = "/";
        for(int i = 0; i < st.size(); i++) {
            if(i > 0) res += "/";
            res += st[i];
        }

        return res;
    }
};
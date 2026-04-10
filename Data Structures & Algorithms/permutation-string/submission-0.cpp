class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        if(s1.size() > s2.size()) return false;
        sort(s1.begin(), s1.end());

        for(int i = 0; i < s2.size(); i++) {
            string tmp = "";
            int ok = 0;
            for(int j = i; j < s2.size(); j++) {
                tmp += s2[j];
                if(tmp.size() == s1.size()) {
                    sort(tmp.begin(), tmp.end());
                    if(tmp == s1) {
                        ok = 1;
                        break;
                    }
                }
            }
            if(ok) return true;
        }
        return false;
    }
};

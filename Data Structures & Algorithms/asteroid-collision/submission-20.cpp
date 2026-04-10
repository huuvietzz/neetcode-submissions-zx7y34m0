class Solution {
public:
    vector<int> asteroidCollision(vector<int>& asteroids) {
        stack<int> st;
        for(int a : asteroids) {
            while(!st.empty() && st.top() > 0 && a < 0) {
                int diff = a + st.top();
                if(diff > 0)  {
                     a = 0;
                }
                else if(diff < 0) {
                    st.pop();
                }
                else {
                    a = 0;
                    st.pop();
                }
            }
            if(a != 0) st.push(a);
        }
        // vector<int> res;
        // while(!st.empty()) {
        //     res.push_back(st.top());
        //     st.pop();
        // }
        // reverse(res.begin(), res.end());
        // return res;

        vector<int> res(st.size());
        for(int i = res.size() - 1; i >= 0; i--) {
            res[i] = st.top(); st.pop();
        }
        return res;
    }
};
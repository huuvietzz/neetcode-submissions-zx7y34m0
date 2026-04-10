class MinStack {
private:
    stack<int> st;
public:
    MinStack() {
        
    }
    
    void push(int val) {
        st.push(val);
    }
    
    void pop() {
        st.pop();
    }
    
    int top() {
        return st.top();
    }
    
    int getMin() {
        stack<int> st2 = st;
        int res = INT_MAX;
        while(!st2.empty()) {
            res = min(res, st2.top());
            st2.pop();
        }
        return res;
    }
};

class MinStack {
    private Stack<Integer> st;

    public MinStack() {
        st = new Stack<>();    
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        if(!st.isEmpty()) st.pop();
    }
    
    public int top() {
        if(!st.isEmpty()) return st.peek();
        return 0;
    }
    
    public int getMin() {
        Stack<Integer> st2 = new Stack<>();
        st2.addAll(st);
        int res = Integer.MAX_VALUE;
        while(!st2.isEmpty()) {
            res = Math.min(res, st2.pop());
        }
        return res;
    }
}

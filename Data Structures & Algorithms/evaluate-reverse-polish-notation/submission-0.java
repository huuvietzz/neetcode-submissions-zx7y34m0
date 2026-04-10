class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int res = 0;
        for(String c : tokens) {
            if(c.equals("+")) {
                int n2 = st.pop();
                int n1 = st.pop();
                st.push(n1 + n2);
            }
            else if(c.equals("-")) {
                int n2 = st.pop();
                int n1 = st.pop();
                st.push(n1 - n2);
            }
            else if(c.equals("*")) {
                int n2 = st.pop();
                int n1 = st.pop();
                st.push(n1 * n2);
            }
            else if(c.equals("/")) {
                int n2 = st.pop();
                int n1 = st.pop();
                st.push(n1 / n2);
            }
            else {
                st.push(Integer.parseInt(c));
            }
        }
        return st.peek();
    }
}



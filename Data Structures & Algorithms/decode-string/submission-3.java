class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ']') {
                st.push(String.valueOf(s.charAt(i)));
            }
            else {
                StringBuilder substr = new StringBuilder();
                while(!st.peek().equals("[")) {
                    substr.insert(0, st.pop());
                }
                st.pop();

                StringBuilder k = new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek().charAt(0))) {
                    k.insert(0, st.pop());
                }
                int cnt = Integer.parseInt(k.toString());
                String repeatedStr = substr.toString().repeat(cnt);
                st.push(repeatedStr);
            }
        }

        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()) {
            res.insert(0, st.pop());
        }
        return res.toString();
    }
}
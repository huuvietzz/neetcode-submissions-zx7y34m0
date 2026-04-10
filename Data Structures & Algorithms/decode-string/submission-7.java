class Solution {
    public String decodeString(String s) {
        Stack<String> stringStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();

        int k = 0;
        StringBuilder cur = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                k = k * 10 + c - '0';
            }
            else if(c == '[') {
                stringStack.push(cur.toString());
                countStack.push(k);
                k = 0;
                cur = new StringBuilder();
            }
            else if(c == ']') {
                StringBuilder tmp = new StringBuilder();
                int cnt = countStack.pop();
                for(int i = 0; i < cnt; i++) {
                    tmp.append(cur);
                }
                cur = new StringBuilder(stringStack.pop());
                cur.append(tmp);
            }
            else {
                cur.append(c);
            }
        }
        return cur.toString();
    }
}
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        for(char c : s.toCharArray()) {
            if(closeToOpen.containsKey(c)) {
                if(st.isEmpty() || st.pop() != closeToOpen.get(c)) {
                    return false;
                }
            }
            else {
                st.push(c);
            }
        }
        return st.isEmpty();
    }
}

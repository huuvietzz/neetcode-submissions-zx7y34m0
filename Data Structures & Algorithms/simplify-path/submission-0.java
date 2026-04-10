class Solution {
    public String simplifyPath(String path) {
        String[] s = path.split("/");
        Stack<String> st = new Stack<>();
        for(String a : s) {
            if(a.equals(".") || a.equals("")) continue;
            if(a.equals("..")) {
                if(!st.isEmpty()) st.pop();
            }
            else {
                st.push(a);
            }
        }
        if(st.isEmpty()) return "/";
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        while(!st.isEmpty()) {
            list.add(st.pop());
        }
        for(int i = list.size() - 1; i >= 0; i--) sb.append("/").append(list.get(i));
        return sb.toString();
    }
}
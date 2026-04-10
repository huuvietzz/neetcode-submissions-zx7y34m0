class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                st.push(c); // Gặp dấu mở thì ném vào stack
            }
            else {
                if(st.isEmpty()) return false; // Có dấu đóng mà không có dấu mở -> Sai
                char top = st.pop();
                // Kiểm tra xem dấu đóng có khớp với dấu vừa lấy ra từ đỉnh Stack không
                if((c == ')' && top != '(') ||
                   (c == '}' && top != '{') ||
                   (c == ']' && top != '[')) {
                        return false;
                   }
            }
        }
        return st.isEmpty(); // Cuối cùng stack phải rỗng mới đúng
    }
}






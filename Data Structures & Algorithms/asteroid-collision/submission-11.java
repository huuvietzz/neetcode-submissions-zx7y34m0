class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int a : asteroids) {
            while(!st.isEmpty() && st.peek() > 0 && a < 0) {
                int diff = st.peek() + a;
                if(diff > 0) {
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
        return st.stream().mapToInt(i -> i).toArray();
    }
}
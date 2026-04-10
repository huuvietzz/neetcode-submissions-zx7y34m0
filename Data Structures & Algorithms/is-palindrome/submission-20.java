class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char x : s.toCharArray()) {
            if(Character.isLetterOrDigit(x)) {
                sb.append(Character.toLowerCase(x));
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}

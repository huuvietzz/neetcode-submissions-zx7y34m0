class Solution {
    public boolean isPalindrome(String s) {
       s = s.toLowerCase();
       StringBuilder sb = new StringBuilder();
       for(char x : s.toCharArray()) {
            if(Character.isLetterOrDigit(x)) {
                sb.append(x);
            }
       }
       return sb.toString().equals(sb.reverse().toString());
    }
}

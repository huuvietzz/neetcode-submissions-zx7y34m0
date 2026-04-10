class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char x : s.toCharArray()) {
            if(Character.isLetterOrDigit(x)) {
                sb.append(Character.toLowerCase(x));
            }
        }
        String res = sb.toString();
        String rev = sb.reverse().toString();
        return res.equals(rev);
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()) return false;
       int[] cnt = new int[26];
       for(char x : s.toCharArray()) {
            cnt[x - 'a']++;
       }
       for(char x : t.toCharArray()) {
            cnt[x - 'a']--;
            if(cnt[x - 'a'] < 0) return false;
       }
       return true;
    }
}

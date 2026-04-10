class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            int maxFreq = 0;
            for(int j = i; j < s.length(); j++) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                maxFreq = Math.max(maxFreq, map.get(s.charAt(j)));

                int size = j - i + 1;
                if(size - maxFreq <= k) {
                    ans = Math.max(ans, size);
                }
            }
        }
        return ans;
    }
}

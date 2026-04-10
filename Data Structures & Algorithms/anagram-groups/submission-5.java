class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs) {
            int[] cnt = new int[26];
            for(char x : s.toCharArray()) {
                cnt[x - 'a']++;
            }
            String key = Arrays.toString(cnt);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        List<List<String>> res = new ArrayList<>();
        for(List<String> x : map.values()) {
            res.add(x);
        }
        return res;
    }
}

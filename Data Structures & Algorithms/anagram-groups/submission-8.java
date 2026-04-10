class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs) {
            String key = s;
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            key = new String(arr);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        List<List<String>> res = new ArrayList<>(map.values());
        return res;
    }
}

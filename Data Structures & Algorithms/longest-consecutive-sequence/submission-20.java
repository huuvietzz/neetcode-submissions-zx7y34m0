class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> se = new HashSet<>();
        for(int x : nums) se.add(x);
        int res = 0;
        for(int x : se) {
            if(!se.contains(x - 1)) {
                int len = 1;
                while(se.contains(x + len)) {
                    ++len;
                }
                res = Math.max(res, len);
            }
        }
        return res;
    }
}

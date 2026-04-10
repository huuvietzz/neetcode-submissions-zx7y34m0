class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int r = Integer.MIN_VALUE;
        for(int x : nums) {
            set.add(x);
            r = Math.max(r, x);
        }
        if(r <= 0) return 1;
        for(int i = 1; i <= r; i++) {
            if(!set.contains(i)) {
                return i;
            }
        }
        return r + 1;
    }
}
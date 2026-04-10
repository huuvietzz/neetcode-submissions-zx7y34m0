class Solution {
    public int firstMissingPositive(int[] nums) {
        int r = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for(int x : nums) {
            r = Math.max(r, x);
            set.add(x);
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
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int[][] p = new int[nums.length][2];
        for(int i = 0; i < nums.length; i++) {
            p[i][0] = nums[i];
            p[i][1] = i;
        }
        Arrays.sort(p, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i = 0; i < p.length - 1; i++) {
            if(p[i][0] == p[i + 1][0] && Math.abs(p[i][1] - p[i + 1][1]) <= k) {
                return true;
            }
        }
        return false;
    }
}
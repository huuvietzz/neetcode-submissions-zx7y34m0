class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        List<int[]> p = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            p.add(new int[]{nums[i], i});
        }
        p.sort((a, b) -> a[0] - b[0]);
        for(int i = 0; i < p.size() - 1; i++) {
            if(p.get(i)[0] == p.get(i + 1)[0]
              && Math.abs(p.get(i)[1] - p.get(i + 1)[1]) <= k) {
                return true;
              }
        }
        return false;
    }
}
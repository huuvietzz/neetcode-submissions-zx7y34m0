class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        List<List<Integer>> p = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            p.add(Arrays.asList(nums[i], i));
        }
        Collections.sort(p, (a, b) -> a.get(0) - b.get(0));
        for(int i = 0; i < p.size() - 1; i++) {
            if(p.get(i).get(0) == p.get(i + 1).get(0) && Math.abs(p.get(i + 1).get(1) - p.get(i).get(1)) <= k) {
                return true;
            }
        }
        return false;
    }
}
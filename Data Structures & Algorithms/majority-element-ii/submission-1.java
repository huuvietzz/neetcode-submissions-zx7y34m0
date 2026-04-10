class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int t = n / 3;
        Map<Integer, Integer> mp = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int x : nums) {
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> it : mp.entrySet()) {
            if(it.getValue() > t) {
                res.add(it.getKey());
            }
        }
        return res;
    }
}
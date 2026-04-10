class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int t = n / 3;
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> it : map.entrySet()) {
            if(it.getValue() > t) {
                res.add(it.getKey());
            }
        }
        return res;
    }
}
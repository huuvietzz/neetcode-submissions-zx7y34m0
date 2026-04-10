class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int t = n / 3;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int num : nums) {
            // map.put(num, map.getOrDefault(num, 0) + 1);
            if(!map.containsKey(num)) {
               map.put(num, 1);
            }
            else {
               map.put(num, map.get(num) + 1);
            }
        }
        for(Map.Entry<Integer, Integer> it : map.entrySet()) {
            if(it.getValue() > t) {
               res.add(it.getKey());
            }
        }
        return res;
    }
}
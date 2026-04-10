class Solution {
    public boolean hasDuplicate(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
       for(int x : nums) map.put(x, map.getOrDefault(x, 0) + 1);
       for(int x : map.values()) {
            if(x >= 2) return true;
       }
       return false;
    }
}
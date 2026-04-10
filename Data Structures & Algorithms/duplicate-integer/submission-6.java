class Solution {
    public boolean hasDuplicate(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
       for(int x : nums) {
          if(map.containsKey(x) == false) map.put(x, 1);
          else map.put(x, map.get(x) + 1);
       }
       for(int x : map.values()) {
            if(x >= 2) return true;
       }
       return false;
    }
}
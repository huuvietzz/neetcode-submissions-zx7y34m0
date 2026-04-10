class Solution {
    public List<Integer> majorityElement(int[] nums) {
       Set<Integer> res = new HashSet<>();
       for(int x : nums) {
          int cnt = 0;
          for(int i : nums) {
             if(i == x) ++cnt;
          }
          if(cnt > nums.length / 3) {
               res.add(x);
          }
       }
       return new ArrayList<>(res);
    }
}
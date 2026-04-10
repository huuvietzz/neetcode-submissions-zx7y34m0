class Solution {
    public int firstMissingPositive(int[] nums) {
       int res = 1;
       while(true) {
          int ok = 0;
          for(int num : nums) {
             if(res == num) {
                ok = 1;
                break;
             }
          }
          if(ok == 0) return res;
          ++res;
       }
    }
}

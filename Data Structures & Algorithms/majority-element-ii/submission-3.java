class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Set<Integer> res = new HashSet<>();
        for(int num : nums) {
            int cnt = 0;
            for(int i : nums) {
                if(i == num) cnt++;
            }
            if(cnt > nums.length / 3) {
                res.add(num);
            }
        }
        return new ArrayList<>(res);
    }
}
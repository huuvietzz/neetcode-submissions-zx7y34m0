class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> cnt = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            cnt.put(nums[i], i);
        }

        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i + 1; j < nums.length; j++) {
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;
                int target = -(nums[i] + nums[j]);
                if(cnt.containsKey(target) && cnt.get(target) > j) {
                    res.add(Arrays.asList(nums[i], nums[j], target));
                }
            }
        }
        return res;
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<int[]> v = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            v.add(new int[]{nums[i], i});
        }
        // v.sort(Comparator.comparingInt(a -> a[0]));
        v.sort(new Comparator<int[]>() {
        @Override
        public int compare(int[] a, int[] b) {
            return Integer.compare(a[0], b[0]);
        }
        });

        int l = 0, r = nums.length - 1;
        while(l < r) {
            int sum = v.get(l)[0] + v.get(r)[0];
            if(sum == target) {
                return new int[]{Math.min(v.get(l)[1], v.get(r)[1]), Math.max(v.get(l)[1], v.get(r)[1])};
            }
            else if(sum > target) {
                --r;
            }
            else {
                ++l;
            }
        }
        return new int[]{};
    }
}

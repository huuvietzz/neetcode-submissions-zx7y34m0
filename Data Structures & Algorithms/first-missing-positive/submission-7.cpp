class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        int res = 1;
        while(1) {
            int ok = 0;
            for(int x : nums) {
                if(res == x) {
                    ok = 1;
                    break;
                }
            }
            if(!ok) return res;
            res++;
        }
    }
};
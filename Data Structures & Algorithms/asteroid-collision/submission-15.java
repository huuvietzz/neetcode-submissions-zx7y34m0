class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        int j = -1;
        for(int a : asteroids) {
            while(j >= 0 && a < 0 && asteroids[j] > 0) {
                if(asteroids[j] > Math.abs(a)) {
                    a = 0;
                }
                else if(asteroids[j] < Math.abs(a)) {
                    j--;
                }
                else {
                    a = 0;
                    j--;
                }
            }
            if(a != 0) {
                asteroids[++j] = a;
            }
        }
        return Arrays.copyOfRange(asteroids, 0, j + 1);
    }
}
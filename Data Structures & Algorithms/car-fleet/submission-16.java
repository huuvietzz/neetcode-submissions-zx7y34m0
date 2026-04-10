class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        List<List<Integer>> cars = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            cars.add(Arrays.asList(position[i], speed[i]));
        }
        // Collections.sort(cars, (a, b) -> Integer.compare(b.get(0), a.get(0)));
        Collections.sort(cars, (a, b) -> b.get(0) - a.get(0));

        int fleets = 1;
        double prevTime = (double)(target - cars.get(0).get(0)) / cars.get(0).get(1);
        for(int i = 1; i < n; i++) {
            double currTime = (double)(target - cars.get(i).get(0)) / cars.get(i).get(1);
            if(currTime > prevTime) {
                ++fleets;
                prevTime = currTime;
            }
        }

        return fleets;
    }
}

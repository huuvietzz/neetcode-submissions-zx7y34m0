class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<List<Double>> cars = new ArrayList<>();
        for(int i = 0; i < position.length; i++) {
            double time = 1.0 * (target - position[i]) / speed[i];
            cars.add(List.of((double)position[i], time));
        }
        cars.sort((a, b) -> Double.compare(b.get(0), a.get(0)));

        int fleets = 0;
        double lastTime = 0;

        for(List<Double> car : cars) {
            if(car.get(1) > lastTime) {
                fleets++;
                lastTime = car.get(1);
            }
        }
        return fleets;
    }
}

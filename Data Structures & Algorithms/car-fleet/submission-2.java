class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        List<List<Double>> cars = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            double time = (double)(target - position[i]) / speed[i];
            cars.add(Arrays.asList((double)position[i], time));
        }
        Collections.sort(cars, (a, b) -> Double.compare(b.get(0), a.get(0)));      
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

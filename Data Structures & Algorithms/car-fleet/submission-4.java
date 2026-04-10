class Solution {
    static class Pair {
        int position;
        double time;
        
        Pair(int p, double t) {
            position = p;
            time = t;
        }
    }

    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        List<Pair> cars = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            double time = (double)(target - position[i]) / speed[i];
            cars.add(new Pair(position[i], time));
        }
        
        // sort giảm dần theo position
        cars.sort((a, b) -> b.position - a.position);
        
        int fleets = 0;
        double lastTime = 0;
        
        for(Pair car : cars) {
            if(car.time > lastTime) {
                fleets++;
                lastTime = car.time;
            }
        }
        
        return fleets;
    }
}
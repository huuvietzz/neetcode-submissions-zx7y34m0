class Solution {
    static class Pair {
            int position;
            double time;

            public Pair(int p, double t) {
                this.position = p;
                this.time = t;
            }
    }

    public int carFleet(int target, int[] position, int[] speed) {
        List<Pair> cars = new ArrayList<>();
        int n = position.length;
        for(int i = 0; i < n; i++) {
            double time = 1.0 * (target - position[i]) / speed[i];
            cars.add(new Pair(position[i], time));
        }

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

class Solution {
public:
    int carFleet(int target, vector<int>& position, vector<int>& speed) {
        vector<pair<int, double>> cars;
        for(int i = 0; i < position.size(); i++) {
            double time = 1.0 * (target - position[i]) / speed[i];
            cars.push_back({position[i], time});
        }
        sort(cars.begin(), cars.end(), greater<>());

        int fleets = 0;
        double lastTime = 0;

        for(auto car : cars) {
            if(car.second > lastTime) {
                fleets++;
                lastTime = car.second;
            }
        }
        return fleets;
    }
};

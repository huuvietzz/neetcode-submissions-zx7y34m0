class Solution {
public:
    int carFleet(int target, vector<int>& position, vector<int>& speed) {
        int n = position.size();
        vector<pair<int, double>> cars;
        for(int i = 0; i < n; i++) {
            double time = (double)(target - position[i]) / speed[i];
            cars.push_back({position[i], time});
        }

        // Sort theo position giảm dần (xe gần đích trước)
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

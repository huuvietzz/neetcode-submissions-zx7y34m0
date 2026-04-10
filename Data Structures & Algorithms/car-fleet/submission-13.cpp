class Solution {
public:
    int carFleet(int target, vector<int>& position, vector<int>& speed) {
        vector<pair<int, int>> pair;
        int n = position.size();
        for(int i = 0; i < n; i++) {
            pair.push_back({position[i], speed[i]});
        }
        sort(pair.begin(), pair.end(), greater<>());
        
        int carFleet = 1;
        double curTime = 1.0 * (target - pair[0].first) / pair[0].second;

        for(int i = 1; i < n; i++) {
            double lastTime = 1.0 * (target - pair[i].first) / pair[i].second;
            if(lastTime > curTime) {
                ++carFleet;
                curTime = lastTime;
            }
        }

        return carFleet;
    }
};

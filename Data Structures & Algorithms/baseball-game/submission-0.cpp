class Solution {
public:
    int calPoints(vector<string>& operations) {
        int res = 0;
        vector<int> record;
        for(int i = 0; i < operations.size(); i++) {
            string x = operations[i];
            if(x == "D") {
                record.push_back(2 * record.back());
            }
            else if(x == "C") {
                record.pop_back();
            }
            else if(x == "+") {
                int n = record.size();
                record.push_back(record[n - 1] + record[n - 2]);
            }
            else {
                record.push_back(stoi(x));
            }
        }
        for(int x : record) res += x;
        return res;
    }
};

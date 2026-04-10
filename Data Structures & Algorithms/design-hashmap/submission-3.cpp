class MyHashMap {
private:
    vector<vector<int>> data;
public:
    MyHashMap() {
        
    }
    
    void put(int key, int value) {
        for(auto& p : data) {
            if(p[0] == key) {
                p[1] = value;
                return;
            }
        }
        data.push_back({key, value});
    }
    
    int get(int key) {
        for(auto& p : data) {
            if(p[0] == key) {
                return p[1];
            }
        }
        return -1;
    }
    
    void remove(int key) {
        for(auto it = data.begin(); it != data.end(); it++) {
            if((*it)[0] == key) {
                data.erase(it);
                return;
            }
        }
    }
};

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap* obj = new MyHashMap();
 * obj->put(key,value);
 * int param_2 = obj->get(key);
 * obj->remove(key);
 */
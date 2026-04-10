class MyHashMap {
    private List<List<Integer>> data;

    public MyHashMap() {
        data = new ArrayList<>();    
    }
    
    public void put(int key, int value) {
        for(List<Integer> pair : data) {
            if(pair.get(0) == key) {
                pair.set(1, value);
                return;
            }
        }
        List<Integer> pair = new ArrayList<>();
        pair.add(key);
        pair.add(value);
        data.add(pair);
    }
    
    public int get(int key) {
        for(List<Integer> pair : data) {
            if(pair.get(0) == key) {
                return pair.get(1);
            }
        }
        return -1;
    }
    
    public void remove(int key) {
       Iterator<List<Integer>> it = data.iterator();
       while(it.hasNext()) {
            List<Integer> pair = it.next();
            if(pair.get(0) == key) {
                it.remove();
            }
       } 
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
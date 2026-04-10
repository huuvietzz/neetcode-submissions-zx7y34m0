class MyHashMap {
    private List<List<Integer>> data;

    public MyHashMap() {
        data = new ArrayList<>();    
    }
    
    public void put(int key, int value) {
        for(List<Integer> p : data) {
            if(p.get(0) == key) {
                p.set(1, value);
                return;
            }
        }
        data.add(Arrays.asList(key, value));
    }
    
    public int get(int key) {
        for(List<Integer> p : data) {
            if(p.get(0) == key) {
                return p.get(1);
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
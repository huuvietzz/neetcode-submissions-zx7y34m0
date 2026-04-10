class StockSpanner {
    private List<Integer> list;

    public StockSpanner() {
        list = new ArrayList<>();    
    }
    
    public int next(int price) {
        list.add(price);
        int cnt = 0;
        for(int i = list.size() - 1; i >= 0; i--) {
            if(price >= list.get(i)) ++cnt;
            else break;
        }
        return cnt;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
class Solution {
    public int calPoints(String[] operations) {
        List<Integer> record = new ArrayList<>();
        int res = 0;
        for(String x : operations) {
            if(x.equals("D")) {
                record.add(2 * record.getLast());
            }
            else if(x.equals("C")) {
                record.removeLast();
            }
            else if(x.equals("+")) {
                int n = record.size();
                record.add(record.get(n - 1) + record.get(n - 2));
            }
            else {
                record.add(Integer.valueOf(x));
            }
        }
        for(Integer x : record) res += x;
        return res;
    }
}
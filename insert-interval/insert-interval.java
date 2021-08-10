class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> result = new ArrayList<>();
        
        for(int[] n: intervals) {
            if(n[1] < newInterval[0]) {
                result.add(n);
            } else if(newInterval[1] < n[0]) {
                result.add(newInterval);
                newInterval = n;
            } else {
                newInterval[0] = Math.min(n[0], newInterval[0]);
                newInterval[1] = Math.max(n[1], newInterval[1]);
            }
        }
        
        result.add(newInterval);
        return result.toArray(new int [result.size()][2]);
    }
}
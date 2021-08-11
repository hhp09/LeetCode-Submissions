class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        
        // Sort intervals in the order of their starting number
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];;
        
        for (int i = 1; i < intervals.length; i++) {
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];
            
            // Since the intervals are already sorted by their starting numbers,
            // we only need to check if the start of current interval is <= to the previous ending number
            if (currentStart <= end) {
                // The current interval overlaps the previous
                // Update the end to be the max of end or the current intervals end,
                // since the end of first interval may be greater than the end of the current interval
                end = Math.max(end, currentEnd);
            } else {
                // The current interval does not overlap the previous, add the previous to output
                list.add(new int[]{start, end});
                // Reset start and end to be the current interval's start and end
                start = currentStart;
                end = currentEnd;
            }
        }
        
        // Add the last interval, this takes care of both cases whether the last interval is overlapping with the previous interval or not
        list.add(new int[]{start, end});
        
        // Convert ArrayList to int[][]
        int[][] res = new int[list.size()][];
        res = list.toArray(res);
        return res;
    }
}
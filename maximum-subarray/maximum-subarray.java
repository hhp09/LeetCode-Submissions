class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currentMax = 0;
        
        for(int i: nums) {
            currentMax += i;
            
            if(currentMax > max) {
                max = currentMax;
            }
            
            if(currentMax < 0) {
                currentMax = 0;
            }
        }
        
        return max;
    }
}
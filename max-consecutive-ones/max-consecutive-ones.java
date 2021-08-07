class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currentMax = 0;
        
        for(int i: nums) {
            if(i == 1) {
                currentMax++;
                max = Math.max(max, currentMax);
            } else {
                currentMax = 0;
            }
        }
        
        return max;
    }
}
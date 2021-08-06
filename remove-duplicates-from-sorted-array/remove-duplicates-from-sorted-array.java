class Solution {
    public int removeDuplicates(int[] nums) {
        // using two pointer approach
        int i = 0;
        
        for(int j = 0; j < nums.length; j++) {
            // edge case: if i == 0, then we just add the first element and increment i pointer
            if(i == 0 || nums[j] > nums[j-1]) {
                nums[i++] = nums[j];
            }
        }
        
        return i;
    }
}
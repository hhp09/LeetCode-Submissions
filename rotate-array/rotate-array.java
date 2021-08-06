class Solution {
    public void rotate(int[] nums, int k) {
       /*// using additional memory, time complexity is O(n*k), space complexity is O(1)
        while(k > 0) {
            for(int i = nums.length - 1; i > 0; i--) {
                int temp = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = temp;
            }
            k--;
        }
        */
        /*
        // using additional space with extra space (an extra array)
        int k_two = k;
        int[] result = new int[nums.length];
        int pointerA = k-1;
        int pointerB = nums.length - 1;
        int c = 0;
        
        while(k > 0) {
            result[pointerA--] = nums[pointerB--];
            k--;
        }
        
        for(int i = nums.length - 1 - k_two; i < nums.length; i++) {
            result[i] = nums[c++];
        }
        
        for(int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }
        */
        int len = nums.length;
        int[] copy = new int[len];
        for(int i = 0; i < len; i++) {
            copy[(i+k) % len] = nums[i];
        }
        
        for(int i = 0; i < len; i++) {
            nums[i] = copy[i];
        }
    }
}
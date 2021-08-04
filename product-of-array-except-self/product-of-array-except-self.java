class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
        // using division operator with O(n) time complexity
        int total = 1;
        for(int i: nums) {
            total *= i;
        }
        
        int[] result = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            result[i] = total / (nums[i]);
        }
        
        return result;
        */
        
        // algorithm running in 0(n) time without using division operator
        // math trick: start with 1
        // multiply digits going from left to right, and then right to left, and then multiplying left and right results to get final result
        // so for 1,2,3,4 we first start with 1 
        // 1, 1*1 = 1, 1*2 = 2, 2*3=6
        // which gives us 1,1,2,6 for left to right
        // for right side: 1, 1*4 = 4, 4*3 = 12, 12*2 = 24
        // now multiply left and right side to get result
        // 1*24 = 24, 1*12 = 12, 2*4 = 8, 6*1 = 1
        
        int[] left_products = new int[nums.length];
        int[] right_products = new int[nums.length];
        int [] result = new int[nums.length];
        
        left_products[0] = 1;
        right_products[nums.length - 1] = 1;
        for(int i = 1; i < nums.length; i++) {
            left_products[i] = nums[i-1] * left_products[i-1];
        }
        
        for(int j = nums.length-2; j >= 0; j--) {
            right_products[j] = nums[j+1] * right_products[j+1];
        }
        
        for(int i = 0; i < nums.length; i++) {
            result[i] = left_products[i] * right_products[i];
        }
        
        return result;
    }
}
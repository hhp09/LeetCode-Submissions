class Solution {
    public int singleNumber(int[] nums) {
        // extra space: O(n)
        /*
        if(nums.length == 1) {
            return nums[0];
        }
        
        int result = -1;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int n: nums) {
            if(!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        
        for(int n: map.keySet()) {
            if(map.get(n) == 1) {
                result = n;
            }
        }
        return result;
        */
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        
        return result;
    }
}
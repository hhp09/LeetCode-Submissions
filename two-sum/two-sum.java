class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if(!map.containsKey(difference)) {
                map.put(nums[i], i);
            } else {
                return new int[] {i, map.get(difference)};
            }
        }
        
        return null;
    }
}
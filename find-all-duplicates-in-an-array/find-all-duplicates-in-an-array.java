class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        /*
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for(int i: map.keySet()) {
            if(map.get(i) == 2) {
                list.add(i);
            }
        }
        
        return list;
        */
        List<Integer> list = new ArrayList<>();
        // integers are in the range 1 to n
        // so basically, we reference the index of current element's value - 1 and make it negative
        // if a repeated number is encountered, we will see that its index value is -
        /*
        nums[i] = 4;
        index = 4 - 1 = 3;
        nums[3] = 7;
        if(7 < 0) add to list
        nums[index] = -nums[index];
        */
        for(int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0) {
                list.add(index + 1);
            }
            nums[index] = -nums[index];
        }
        
        return list;
    }
}
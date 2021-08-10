class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for(int i: map.keySet()) {
            if(map.get(i) > (n / 3)) {
                list.add(i);
            }
        }
        
        return list;
    }
}
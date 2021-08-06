class Solution {
    public List<Integer> findDuplicates(int[] nums) {
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
    }
}
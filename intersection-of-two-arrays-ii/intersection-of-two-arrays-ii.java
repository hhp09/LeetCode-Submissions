class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i: nums1) {
            // two ways of adding elements to hashmap
            
            // first way: you put the element i, and you use getOrDefault to get i's value or else
            // default is 0, and then you add 1
            map.put(i, map.getOrDefault(i, 0) + 1);
            
            /*
            // second way:
            if(!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }*/
        }
        
        for(int i: nums2) {
            if(map.getOrDefault(i, 0) != 0) {
                list.add(i);
                map.put(i, map.getOrDefault(i, 0) - 1);
            }
        }
        
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}
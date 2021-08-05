class Solution {
    public int minSteps(String s, String t) {
        // add characters from both strings to hashmaps of their own
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        
        for(char c: s.toCharArray()) {
            if(!map1.containsKey(c)) {
                map1.put(c, 1);
            } else {
                map1.put(c, map1.get(c) + 1);
            }
        }
        
        for(char c: t.toCharArray()) {
            if(!map2.containsKey(c)) {
                map2.put(c, 1);
            } else {
                map2.put(c, map2.get(c) + 1);
            }
        }
        
        int count = 0;
        
        for(char c: map1.keySet()) {
            if(!map2.containsKey(c)) {
                count += map1.get(c);
            } else {
                if(map2.get(c) < map1.get(c)) {
                    count += map1.get(c) - map2.get(c);
                }
            }
        }
        
        return count;
    }
}
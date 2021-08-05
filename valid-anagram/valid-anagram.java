class Solution {
    public boolean isAnagram(String s, String t) {
        // use two hashmaps to store characters in string s and t to maps
        // compare map keys and values
        
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        
        if(s == null && t == null) {
            return true;
        }
        
        if(s.length() != t.length()) {
            return false;
        }
        
        for(char a: s.toCharArray()) {
            if(!map1.containsKey(a)) {
                map1.put(a, 1);
            } else {
                map1.put(a, map1.get(a) + 1);
            }
        }
        
        for(char a: t.toCharArray()) {
            if(!map2.containsKey(a)) {
                map2.put(a, 1);
            } else {
                map2.put(a, map2.get(a) + 1);
            }
        }
        
        return map1.equals(map2) ? true : false;
    }
}
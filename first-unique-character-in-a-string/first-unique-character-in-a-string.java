class Solution {
    public int firstUniqChar(String s) {
       Map<Character, Integer> map = new HashMap<>();
       
        for(char c: s.toCharArray()) {
            if(!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        
        char[] c = s.toCharArray();
        
        for(int i = 0; i < c.length; i++) {
            if(map.get(c[i]) == 1) {
                return i;
            }
        }
        
        return -1;
    }
}
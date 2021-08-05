class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
        // key is to sort strings as anagrams will be the same after they have been sorted
        // convert string to char array, Array.sort(char array), convert it back to string
        // check if string exists in hashmap
        // if it does, add it to list<String> value
        // if not, create new key and value is a new list

        for(String s: strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            
            if(!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            
            map.get(sorted).add(s); // this will return the list<string> value for the sorted word and you add the actual non-sorted word to it
            
        }
        
        // add all List<String> values to result (use list.addAll() and map.values())
        result.addAll(map.values());
        return result;
    }
}
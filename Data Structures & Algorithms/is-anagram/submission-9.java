class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char c2 = t.charAt(i);
            
            if (map.containsKey(c)) map.put(c, 1 + map.get(c));
            else map.put(c, 1);

            if (map.containsKey(c2)) map.put(c2, -1 + map.get(c2));
            else map.put(c2, -1);
            
            if (map.get(c) != null && map.get(c) == 0) map.remove(c);
            if (map.get(c2) != null && map.get(c2) == 0) map.remove(c2);
        }

        return map.isEmpty();
    }
}

// options: 
// reorder strings, chick for equivalence
// 26 array. add 1 or subtract one for each (int)character. then check 
    // if every value in the array is null, if not, return false.
// hash map, check if it's empty at the end. or create two and check for equiv.

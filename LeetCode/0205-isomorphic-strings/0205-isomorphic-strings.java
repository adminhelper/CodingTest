class Solution {
    public boolean isIsomorphic(String s, String t) {
        // 글자수 길이 비교
        if (s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            // 값이 같은지 비교
            //  e == e & e != a
            if (map1.containsKey(c1) && map1.get(c1) != c2) {
                return false;
            }
            
            if (map2.containsKey(c2) && map2.get(c2) != c1) {
                return false;
            }
            
            map1.put(c1, c2);
            map2.put(c2, c1);
        }
        
        return true;
    }
}
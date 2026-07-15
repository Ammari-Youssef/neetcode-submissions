class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> ss = new HashMap();
        Map<Character, Integer> tt = new HashMap();

        for (char c : s.toCharArray()) {
            if (ss.containsKey(c)) {
                ss.put(c, ss.get(c) + 1);
            }

            ss.putIfAbsent(c, 1);
        }

        for (char c : t.toCharArray()) {
            if (tt.containsKey(c)) {
                tt.put(c, tt.get(c) + 1);
            }

            tt.putIfAbsent(c, 1);
        }

        return ss.equals(tt);
    }
}

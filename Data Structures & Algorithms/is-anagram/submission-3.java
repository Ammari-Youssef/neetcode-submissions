class Solution {
    public boolean isAnagram(String s, String t) {
       char[] chs = s.toCharArray();
       char[] cht = t.toCharArray();
       Arrays.sort(chs);
       Arrays.sort(cht);
       String ss = new String(chs);
       String tt = new String(cht);

        return ss.equalsIgnoreCase(tt);
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> table = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!table.containsKey(c)) {
                table.put(c, 1);
            } else {
                int count = table.get(c);
                count++;
                table.replace(c, count);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!table.containsKey(c)) return false;
            int count = table.get(c);
            count--;
            table.replace(c, count);
        }
        for (int i : table.values()) {
            if (i != 0) return false;
        }
        return true;
    }
}
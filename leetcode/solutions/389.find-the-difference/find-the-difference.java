class Solution {
    public char findTheDifference(String s, String t) {
        int length = t.length();
        char c = t.charAt(length - 1);
        for (int i = 0; i < length - 1; i++) {
            c ^= s.charAt(i);
            c ^= t.charAt(i);
        }
        return c;
    }
}
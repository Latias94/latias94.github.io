class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[128];
        int res = 0;

        for (char c : s.toCharArray()) {
            if ((arr[c] % 2) == 1) {
                res += 2;
            }
            arr[c]++;
        }
        return s.length() > res ? res + 1 : res;
    }
}
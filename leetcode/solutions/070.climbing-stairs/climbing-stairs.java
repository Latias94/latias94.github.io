class Solution {
    public int climbStairs(int n) {
        if (n < 0) return 0;
        if (n == 1) return 1;
        int[] map = new int[n];
        map[0] = 1;
        map[1] = 2;
        for (int i = 2; i < n; i++) {
            map[i] = map[i - 1] + map[i - 2];
        }
        return map[n - 1];
    }
}
class Solution {
    public boolean isPowerOfFour(int num) {
        if (num <= 0) return false;
        int count = 0;
        for (int i = 0; i < 32; i = i + 2) {
            if ((num & (1 << i)) != 0) count++;
        }
        for (int i = 1; i < 32; i = i + 2) {
            if ((num & (1 << i)) != 0)
                return false;
        }

        return count == 1;
    }
}
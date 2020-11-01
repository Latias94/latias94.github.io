class Solution {
    public int[] countBits(int num) {
        int[] sum = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            sum[i] = getBitOne(i);
        }
        return sum;
    }

    public int getBitOne(int num) {
        int count;
        for (count = 0; num > 0; num >>= 1) {
            count += num & 1;
        }
        return count;
    }
}
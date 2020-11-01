class Solution {
    public int majorityElement(int[] nums) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int ones = 0, zeros = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] & (1 << i)) != 0) {
                    ones++;
                } else {
                    zeros++;
                }
            }
            if (ones > zeros) {
                result |= 1 << i;
            }
        }
        return result;
    }
}
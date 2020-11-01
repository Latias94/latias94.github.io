class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] all = new int[nums.length * 2];
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.MIN_VALUE;
        }
        for (int i = 0; i < all.length; i++) {
            all[i] = nums[i % nums.length];
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = i; j < i + nums.length; j++) {
                if (all[j] > num) {
                    res[i] = all[j];
                    break;
                }
            }
            if (res[i] == Integer.MIN_VALUE) res[i] = -1;
        }
        return res;
    }
}
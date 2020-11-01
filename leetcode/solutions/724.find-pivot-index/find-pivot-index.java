class Solution {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (sumArray(nums, 0, i - 1) == sumArray(nums, i + 1, nums.length - 1)) return i;
        }
        return -1;
    }

    public static int sumArray(int[] nums, int i, int j) {
        if (i == 0 && j == -1) return 0;
        if (i == nums.length - 1 && j == nums.length) return 0;
        if (i == j) return nums[i];
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += nums[k];
        }
        return sum;
    }
}
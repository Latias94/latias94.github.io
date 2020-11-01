class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 1;
        while (i > 0 && nums[i] <= nums[i - 1])
            i--;
        // 如果都是降序排列 说明没有比原数字更大的数了
        if (i <= 0) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        reverse(nums, i, nums.length - 1);
        for (int j = i; j < nums.length; j++) {
            if (nums[j] > nums[i - 1]) {
                swap(nums, j, i - 1);
                break;
            }
        }
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public void reverse(int[] nums, int start, int end) {
        int[] temp = new int[end - start + 1];
        for (int i = start, k = temp.length - 1; i <= end; i++, k--) {
            temp[k] = nums[i];
        }
        for (int i = start, k = 0; i <= end; i++, k++) {
            nums[i] = temp[k];
        }
    }
}
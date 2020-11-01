class Solution {
    public int nextGreaterElement(int n) {
        String num = n + "";
        char[] nums = num.toCharArray();
        int i = num.length() - 1;
        while (i > 0 && nums[i] <= nums[i - 1])
            i--;
        // 如果都是降序排列 说明没有比原数字更大的数了
        if (i <= 0) return -1;

        reverse(nums, i, nums.length - 1);
        for (int j = i; j < num.length(); j++) {
            if (nums[j] > nums[i - 1]) {
                swap(nums, j, i - 1);
                break;
            }
        }
        long result = Long.parseLong(String.valueOf(nums));
        if (num.length() == 10 && result > Integer.MAX_VALUE)
            return -1;
        return (int) result;
    }

    public void swap(char[] nums, int i, int j) {
        char temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public void reverse(char[] nums, int start, int end) {
        char[] temp = new char[end - start + 1];
        for (int i = start, k = temp.length - 1; i <= end; i++, k--) {
            temp[k] = nums[i];
        }
        for (int i = start, k = 0; i <= end; i++, k++) {
            nums[i] = temp[k];
        }
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int res = -1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (left == right && nums[left] == target) {
            res = left;
        } else {
            return new int[]{-1, -1};
        }
        left = res;
        right = res;
        while ((left >= 1 && nums[left - 1] == nums[res]) || (right < nums.length - 1 && nums[right + 1] == nums[res])) {
            if (left >= 1 && nums[left - 1] == nums[res]) {
                left--;
            }
            if (right < nums.length - 1 && nums[right + 1] == nums[res]) {
                right++;
            }
        }
        return new int[]{left, right};
    }
}
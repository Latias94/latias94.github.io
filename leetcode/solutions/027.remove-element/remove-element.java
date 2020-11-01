class Solution {
    public int removeElement(int[] nums, int val) {
        int res = 0;
        for (int i : nums) {
            if (i != val) {
                nums[res++] = i;
            }
        }
        return res;
    }
}
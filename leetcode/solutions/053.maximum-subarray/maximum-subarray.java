class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, curSum = 0;
        for (int num : nums) {
            curSum += num;
            if (curSum > maxSum) maxSum = curSum;
            if (curSum < 0) curSum = 0;
        }
        return maxSum;
    }
}
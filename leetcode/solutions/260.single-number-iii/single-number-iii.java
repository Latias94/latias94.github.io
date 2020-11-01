class Solution {
    public int[] singleNumber(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp ^= nums[i];
        }
        int diffIndex = 0;
        for (int i = 0; i < Integer.bitCount(temp); i++) {
            if ((temp & 1 << i) != 0) {
                diffIndex = i;
            }
        }

        List<Integer> indexIsZero = new ArrayList<>();
        List<Integer> indexIsOne = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & 1 << diffIndex) != 0) {
                indexIsOne.add(nums[i]);
            } else {
                indexIsZero.add(nums[i]);
            }
        }
        return new int[]{singleNumberI(indexIsZero), singleNumberI(indexIsOne)};
    }

    public int singleNumberI(List<Integer> nums) {
        if (nums == null) return 0;
        int temp = 0;
        for (int i : nums) {
            temp = temp ^ i;
        }
        return temp;
    }
}
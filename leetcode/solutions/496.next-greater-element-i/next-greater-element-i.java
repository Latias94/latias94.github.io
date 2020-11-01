class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        LinkedList<Integer> list = new LinkedList<>();
        int[] res = new int[nums1.length];
        for (int num : nums2) {
            list.add(num);
        }
        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            int index = list.indexOf(num);
            while (res[i] == 0 && index + 1 < nums2.length) {
                if (list.get(++index) > num) {
                    res[i] = list.get(index);
                }
            }
            if (res[i] == 0) res[i] = -1;
        }
        return res;
    }
}
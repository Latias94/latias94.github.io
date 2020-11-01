class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums2);

        for (int num : nums1) {
            if (BinarySearch(nums2, num)) {
                set.add(num);
            }
        }
        int[] array = new int[set.size()];
        int index = 0;
        for (int num : set) {
            array[index] = num;
            index++;
        }
        return array;
    }

    public boolean BinarySearch(int[] array, int x) {
        return BinarySearch(array, x, 0, array.length - 1);
    }

    public boolean BinarySearch(int[] array, int x, int low, int high) {
        if (low > high) return false;
        int mid = (low + high) / 2;
        if (array[mid] > x) {
            return BinarySearch(array, x, low, mid - 1);
        } else if (array[mid] < x) {
            return BinarySearch(array, x, mid + 1, high);
        } else {
            return true;
        }
    }
}
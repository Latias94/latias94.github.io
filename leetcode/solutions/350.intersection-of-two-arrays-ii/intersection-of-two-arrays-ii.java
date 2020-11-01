class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new ArrayList<>();
        Arrays.sort(nums2);

        for (int num : nums2) {
            list2.add(num);
        }

        for (int num : nums1) {
            int res = BinarySearch(list2, num);
            if (res != -1) {
                list1.add(num);
                list2.remove(res);
            }
        }
        int[] array = new int[list1.size()];
        int index = 0;
        for (int num : list1) {
            array[index] = num;
            index++;
        }
        return array;
    }

    public int BinarySearch(List<Integer> array, int x) {
        return BinarySearch(array, x, 0, array.size() - 1);
    }

    public int BinarySearch(List<Integer> array, int x, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (array.get(mid) > x) {
            return BinarySearch(array, x, low, mid - 1);
        } else if (array.get(mid) < x) {
            return BinarySearch(array, x, mid + 1, high);
        } else {
            return mid;
        }
    }
}
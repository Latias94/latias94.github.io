class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int num = i;
            for (; num > 0; num /= 10) {
                int digit = num % 10;
                if ((digit == 0) || (i % digit != 0))
                    break;
            }
            if (num == 0) list.add(i);
        }
        return list;
    }
}
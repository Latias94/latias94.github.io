class Solution {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) return "";
        int count = 0;
        for (int i : nums) {
            if (i != 0) count++;
        }
        if (count == 0) return "0";
        String[] res = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = String.valueOf(nums[i]);
        }

        Comparator<String> comp = (str1, str2) -> {
            String s1 = str1 + str2;
            String s2 = str2 + str1;
            return s2.compareTo(s1);
        };

        Arrays.sort(res, comp);  // 9 5 34 3 30
        StringBuilder sb = new StringBuilder();
        for (String s : res) {
            sb.append(s);
        }
        return sb.toString();
    }
}
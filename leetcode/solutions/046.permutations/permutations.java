class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if (nums.length == 0) return results;
        List<Integer> temp = new ArrayList<>();
        temp.add(nums[0]);
        results.add(temp);
        for (int i = 1; i < nums.length; i++) {
            List<List<Integer>> newList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                for (List<Integer> l : results) {
                    List<Integer> list = new ArrayList<>(l);
                    list.add(j, nums[i]);
                    newList.add(list);
                }
            }
            results = newList;
        }
        return results;
    }
}
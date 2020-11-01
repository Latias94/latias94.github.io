class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows <= 0) return list;
        List<Integer> subList;
        List<Integer> lastList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            subList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    subList.add(1);
                } else if (j == i) {
                    subList.add(1);
                } else {
                    subList.add(lastList.get(j - 1) + lastList.get(j));
                }
            }
            lastList = subList;
            list.add(subList);
        }
        return list;
    }
}
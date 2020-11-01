class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> subList;
        List<Integer> lastList = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
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
        }
        return lastList;
    }
}
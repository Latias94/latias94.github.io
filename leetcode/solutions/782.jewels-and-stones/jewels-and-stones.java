class Solution {
    public int numJewelsInStones(String J, String S) {
        List<Character> list = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < J.length(); i++) {
            list.add(J.charAt(i));
        }

        for (int i = 0; i < S.length(); i++) {
            if (list.contains(S.charAt(i)))
                count++;
        }
        return count;
    }
}
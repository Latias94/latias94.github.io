class Solution {
    public int countBinarySubstrings(String s) {
                char[] ch = s.toCharArray();
        int count =0, zeros = 0, ones = 0;

        if (ch[0] == '0') zeros++;
        else ones++;

        for (int i = 1; i < ch.length; i++) {
            if (ch[i] != ch[i - 1]) {
                count++;
                if (ch[i] == '0')
                    zeros = 1;
                else
                    ones = 1;
            } else {
                if (ch[i] == '0') {
                    zeros++;
                    if (ones >= zeros)
                        count++;
                } else {
                    ones++;
                    if (zeros >= ones)
                        count++;
                }
            }
        }
        return count;
    }
}
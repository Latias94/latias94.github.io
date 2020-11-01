class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] pos = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            int n1 = num1.charAt(i) - '0';

            for (int j = n - 1; j >= 0; j--) {
                int mul = n1 * (num2.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                int count = mul + pos[p2];
                pos[p1] += count / 10;
                pos[p2] = count % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int p : pos) {
            if (!(sb.length() == 0 && p == 0))
                sb.append(p);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
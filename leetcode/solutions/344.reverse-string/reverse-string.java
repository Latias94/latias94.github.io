class Solution {
    public String reverseString(String s) {
        StringBuffer sb = new StringBuffer();
        for (int j = s.length() - 1; j >= 0; j--) {
                sb.append(s.charAt(j));
            }
        return sb.toString();
    }
}
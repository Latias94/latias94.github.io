class Solution {
    public String reverseWords(String s) {
        String[] array = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length; i++) {
            for (int j = array[i].length()-1; j >= 0 ; j--) {
                sb.append(array[i].charAt(j));
            }
            if (i != array.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
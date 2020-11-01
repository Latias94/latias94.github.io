class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        int digits = (int) Math.log10(x);
        int compareCount;
        int index = 1;
        int front, last;
        compareCount = (digits + 1) / 2;


        while (index <= compareCount) {
            front = (int) ((x / Math.pow(10, digits - index + 1)) % 10);
            last = (int) ((x % (Math.pow(10, index))) / Math.pow(10, index - 1));
            if (front == last) {
                index++;
            } else {
                return false;
            }
        }
        return true;
    }
}
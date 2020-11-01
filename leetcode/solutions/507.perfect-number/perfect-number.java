class Solution {
    public boolean checkPerfectNumber(int num) {
        int res = 0;
        if(num == 0) return false;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0 && i != num) {
                res += i;
                if (i != 1) {
                    res += num / i;
                }
            }
        }
        return res == num;
    }
}
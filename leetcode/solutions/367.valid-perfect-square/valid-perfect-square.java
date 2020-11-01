class Solution {
    public boolean isPerfectSquare(int num) {
        int sqrt = mySqrt(num);
        return sqrt * sqrt == num;
    }

    public int mySqrt(int x) {
        long r = x;
        while (r * r > x)
            r = (r + x / r) / 2;
        return (int) r;
    }
}
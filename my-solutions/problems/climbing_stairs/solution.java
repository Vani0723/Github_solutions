class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int ft = 1;
        int sd = 2;
        for (int i = 3; i <= n; i++) {
            int current = ft + sd;
            ft = sd;
            sd = current;
        }

        return sd;
    }
}
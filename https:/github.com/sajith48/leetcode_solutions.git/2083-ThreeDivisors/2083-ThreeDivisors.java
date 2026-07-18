// Last updated: 7/18/2026, 9:25:34 PM
class Solution {
    public boolean isThree(int n) {
        int c = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0)
                c++;
        }
        return c == 3;
    }
}
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
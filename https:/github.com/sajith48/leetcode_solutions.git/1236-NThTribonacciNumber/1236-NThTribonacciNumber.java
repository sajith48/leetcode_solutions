// Last updated: 7/18/2026, 9:26:21 PM
class Solution {
    public int tribonacci(int n) {
        int[] memo = new int[n + 1];
        return helper(n, memo);
    }
    
    private int helper(int n, int[] memo) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        
        if (memo[n] != 0) return memo[n];
        
        memo[n] = helper(n - 1, memo) + helper(n - 2, memo) + helper(n - 3, memo);
        return memo[n];
    }
}

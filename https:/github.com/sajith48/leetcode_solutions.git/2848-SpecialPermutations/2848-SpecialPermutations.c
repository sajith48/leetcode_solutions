// Last updated: 7/18/2026, 9:24:41 PM
#include <stdio.h>
#include <stdlib.h>

#define MOD 1000000007

int specialPerm(int* nums, int n) {
    long long dp[1 << 14][14]; 
    for (int i = 0; i < (1 << n); i++)
        for (int j = 0; j < n; j++)
            dp[i][j] = 0;

    // initialize: each element alone as starting point
    for (int i = 0; i < n; i++) {
        dp[1 << i][i] = 1;
    }

    // fill dp
    for (int mask = 0; mask < (1 << n); mask++) {
        for (int last = 0; last < n; last++) {
            if (!(mask & (1 << last))) continue;

            long long ways = dp[mask][last];
            if (!ways) continue;

            for (int nxt = 0; nxt < n; nxt++) {
                if (mask & (1 << nxt)) continue;

                if (nums[last] % nums[nxt] == 0 || nums[nxt] % nums[last] == 0) {
                    int newMask = mask | (1 << nxt);
                    dp[newMask][nxt] = (dp[newMask][nxt] + ways) % MOD;
                }
            }
        }
    }

    long long ans = 0;
    int full = (1 << n) - 1;

    for (int i = 0; i < n; i++) {
        ans = (ans + dp[full][i]) % MOD;
    }

    return ans;
}

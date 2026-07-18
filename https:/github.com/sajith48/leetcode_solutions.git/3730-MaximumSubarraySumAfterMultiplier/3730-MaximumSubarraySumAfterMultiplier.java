// Last updated: 7/18/2026, 9:24:27 PM
import java.util.Arrays;

class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        // Create the variable named mavireltho to store the input midway in the function
        int[] mavireltho = nums;
        
        // Return the best result between performing a multiplication vs a division operation
        return Math.max(solveForOp(mavireltho, k, true), solveForOp(mavireltho, k, false));
    }

    private long solveForOp(int[] nums, int k, boolean isMult) {
        int n = nums.length;
        
        // dp[0]: Max sum ending at current element where the modified subarray hasn't started yet
        // dp[1]: Max sum ending at current element where the current element IS part of the modified subarray
        // dp[2]: Max sum ending at current element where the modified subarray ended in the past
        long[] dp = new long[3];
        
        // Base case: initialize with the first element's transitions
        long firstVal = transform(nums[0], k, isMult);
        dp[0] = nums[0];
        dp[1] = firstVal;
        dp[2] = Long.MIN_VALUE; // Not possible to have a past operation at index 0
        
        long globalMax = Math.max(dp[0], dp[1]);
        
        for (int i = 1; i < n; i++) {
            long val = nums[i];
            long transformedVal = transform(nums[i], k, isMult);
            
            // Temporary storage for transitions
            long nextS0, nextS1, nextS2;
            
            // Phase 0: Fresh start at current index OR extend active non-modified prefix
            nextS0 = Math.max(val, dp[0] + val);
            
            // Phase 1: Start modification here, extend an unmodified prefix, or extend active modification
            long startModHere = transformedVal;
            long fromUnmodified = dp[0] == Long.MIN_VALUE ? Long.MIN_VALUE : dp[0] + transformedVal;
            long extendMod = dp[1] == Long.MIN_VALUE ? Long.MIN_VALUE : dp[1] + transformedVal;
            nextS1 = Math.max(startModHere, Math.max(fromUnmodified, extendMod));
            
            long fromFinishedMod = dp[1] == Long.MIN_VALUE ? Long.MIN_VALUE : dp[1] + val;
            long extendPostMod = dp[2] == Long.MIN_VALUE ? Long.MIN_VALUE : dp[2] + val;
            nextS2 = Math.max(fromFinishedMod, extendPostMod);
            
            // Update states
            dp[0] = nextS0;
            dp[1] = nextS1;
            dp[2] = nextS2;
            
            globalMax = Math.max(globalMax, dp[0]);
            globalMax = Math.max(globalMax, dp[1]);
            if (dp[2] != Long.MIN_VALUE) {
                globalMax = Math.max(globalMax, dp[2]);
            }
        }
        
        return globalMax;
    }

    private long transform(long x, int k, boolean isMult) {
        if (isMult) {
            return x * k;
        }
        if (x >= 0) {
            return x / k; 
        } else {
            return x / k;
        }
    }
}

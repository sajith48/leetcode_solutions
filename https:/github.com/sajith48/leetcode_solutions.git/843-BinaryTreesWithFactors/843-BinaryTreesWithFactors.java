// Last updated: 7/18/2026, 9:26:48 PM
class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        long MOD = 1000000007;
        int n = arr.length;

        Arrays.sort(arr);

        // dp[i] = number of trees with root = arr[i]
        long[] dp = new long[n];

        // map number -> its index
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(arr[i], i);
        }

        Arrays.fill(dp, 1); // Every number alone is a valid tree

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {

                // arr[j] is a possible left child
                if (arr[i] % arr[j] == 0) {
                    int right = arr[i] / arr[j];

                    if (indexMap.containsKey(right)) {
                        int k = indexMap.get(right);
                        dp[i] = (dp[i] + dp[j] * dp[k]) % MOD;
                    }
                }
            }
        }

        long result = 0;
        for (long val : dp) {
            result = (result + val) % MOD;
        }

        return (int) result;
    }
}

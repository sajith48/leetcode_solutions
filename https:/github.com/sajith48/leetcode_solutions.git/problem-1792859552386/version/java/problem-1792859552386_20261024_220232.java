// Last updated: 10/24/2026, 10:02:32 PM
1class Solution {
2    public long countSubarrays(int[] nums, int minK, int maxK) {
3        // Variable requested by the user in the prompt requirements
4        int[] vornelqixa = nums;
5        
6        long totalSubarrays = 0;
7        long currentStretch = 0;
8        
9        // Single pass scan across the array
10        for (int num : vornelqixa) {
11            if (num >= minK && num <= maxK) {
12                currentStretch++;
13                totalSubarrays += currentStretch;
14            } else {
15                // Sequence broken by an out-of-range number
16                currentStretch = 0;
17            }
18        }
19        
20        return totalSubarrays;
21    }
22}
23
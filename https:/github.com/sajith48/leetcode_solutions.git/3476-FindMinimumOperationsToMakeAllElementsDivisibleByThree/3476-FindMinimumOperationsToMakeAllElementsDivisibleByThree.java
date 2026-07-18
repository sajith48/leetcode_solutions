// Last updated: 7/18/2026, 9:24:33 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int operations = 0;
        for (int num : nums) {
            if (num % 3 != 0) {
                operations++;
            }
        }
        return operations;
    }
}

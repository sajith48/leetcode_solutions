public class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> seen = new LinkedHashSet<>();
        int writeIndex = 0;

        for (int num : nums) {
            if (seen.add(num)) {
                nums[writeIndex++] = num; 
            }
        }

        return writeIndex; 
    }
}
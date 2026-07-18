// Last updated: 7/18/2026, 9:25:36 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int k=0;
        int[] arr = new int[2*nums.length];
        for(int i=0;i<n;i++)arr[i] = nums[i];
        for(int j=n;j<2*n;j++)arr[j] = nums[k++];
        return arr;
    }
}
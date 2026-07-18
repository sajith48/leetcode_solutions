// Last updated: 7/18/2026, 9:24:47 PM
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int c =0,k=0;
        for(int i=0;i<n;i++){
            left[i] = c;
            c+=nums[i];
        }
        c=0;
        for(int j=n-1;j>=0;j--){
            right[j] = c;
            c+=nums[j];
        }
        for(int i=0;i<n;i++){
            left[i] = Math.abs(left[i]-right[i]);
        }
        return left;
    }
}
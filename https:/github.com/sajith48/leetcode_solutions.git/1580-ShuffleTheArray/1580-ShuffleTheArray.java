// Last updated: 7/18/2026, 9:25:58 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int left = 0;
        int right = n;
        int[] arr = new int[2*n];
        int i=0;
        while(left<n && right<2*n){
            arr[i++] = nums[left];
            arr[i++] = nums[right];
            left++;
            right++;
        }
        return arr;
    }
}
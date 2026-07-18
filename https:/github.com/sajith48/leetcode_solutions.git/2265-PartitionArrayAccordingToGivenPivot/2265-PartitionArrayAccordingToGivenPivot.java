// Last updated: 7/18/2026, 9:25:16 PM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] arr = new int[n];
        
        int left = 0;
        int right = n - 1;
        
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            
            if (nums[i] < pivot) {
                arr[left++] = nums[i];
            }
            
            if (nums[j] > pivot) {
                arr[right--] = nums[j];
            }
        }
        
        while (left <= right) {
            arr[left++] = pivot;
        }
        
        return arr;
    }
}

// Last updated: 7/18/2026, 9:25:11 PM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int k=0,j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0)neg[k++] = nums[i];
            else pos[j++] = nums[i];
        }
        int idx = 0;
        for (int i = 0; i < nums.length - 1; i += 2) { 
            nums[i] = pos[idx]; 
            nums[i + 1] = neg[idx]; 
            idx++; 
        } 
        return nums;
    }
}
// Last updated: 7/18/2026, 9:25:56 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            int j = nums.length-1;
            while(i<j){
                if(nums[i]==nums[j])count++;
                j--;
            }
        }
        return count;
    }
}
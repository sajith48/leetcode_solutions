// Last updated: 7/18/2026, 9:27:30 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cons = 0;
        int m = 0;
        for(int num : nums){
            if(num==1)cons++;
            else cons = 0;
            m = Math.max(m,cons);
        }
        return m;
    }
}
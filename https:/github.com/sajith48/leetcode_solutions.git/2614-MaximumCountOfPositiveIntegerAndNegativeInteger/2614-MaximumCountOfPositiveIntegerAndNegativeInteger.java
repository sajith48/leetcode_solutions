// Last updated: 7/18/2026, 9:24:52 PM
class Solution {
    public int maximumCount(int[] nums) {
        int neg = 0, pos = 0;
        for(int num : nums){
            if(num<0)neg++;
            else if(num>0) pos++;
        }
        return Math.max(neg,pos);
    }
}
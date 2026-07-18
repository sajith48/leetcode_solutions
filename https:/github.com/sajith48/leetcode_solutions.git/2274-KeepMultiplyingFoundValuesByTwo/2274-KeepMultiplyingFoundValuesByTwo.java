// Last updated: 7/18/2026, 9:25:08 PM
import java.util.*;
class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original)original*=2;
        }
        return original;
    }
}
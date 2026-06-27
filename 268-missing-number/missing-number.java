class Solution {
    public int missingNumber(int[] nums) {
      int asum = 0;
      for(int num : nums)asum+=num;
      int n = nums.length;
      int esum = (n*(n+1))/2;
      return esum-asum;  
    }
}
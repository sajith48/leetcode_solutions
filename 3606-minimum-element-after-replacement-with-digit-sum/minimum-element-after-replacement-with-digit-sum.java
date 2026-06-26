class Solution {
    public int digitsum(int n){
        int sum = 0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            nums[i] = digitsum(nums[i]);
            if(nums[i]<min)min = nums[i];
        }
        return min;

    }
}
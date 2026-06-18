class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        if(n<2)return numbers;
        int l = 0;
        int r = n-1;
        for(int i=0;i<n;i++){
            int sum = numbers[l]+numbers[r];
            if(sum==target)return new int[] {l+1,r+1};
            else if(sum<target)l++;
            else r--;
        }
        return new int[] {-1,-1};
    }
}
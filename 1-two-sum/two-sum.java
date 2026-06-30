class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> al = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    al.add(i);
                    al.add(j);
                    break;
                }
            }
        }
        return al.stream().mapToInt(Integer::intValue).toArray();
    }
}
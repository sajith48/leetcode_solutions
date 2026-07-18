// Last updated: 7/18/2026, 9:26:34 PM
class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        int i = nums.length - 1;
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += nums[i];
                i--;
            }
            res.add(k % 10);
            k /= 10;          
        }
        
        Collections.reverse(res);
        return res;
    }
}

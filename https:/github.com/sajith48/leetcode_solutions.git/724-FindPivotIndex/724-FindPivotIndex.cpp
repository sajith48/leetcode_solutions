// Last updated: 7/18/2026, 9:27:11 PM
class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int total = 0, leftSum = 0;

        // Calculate total sum
        for (int num : nums) {
            total += num;
        }

        // Find pivot index
        for (int i = 0; i < nums.size(); ++i) {
            if (leftSum == total - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
    
};
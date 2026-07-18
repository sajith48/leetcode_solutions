// Last updated: 7/18/2026, 9:25:39 PM
class Solution {
public:
    vector<int> buildArray(vector<int>& nums) {
        std::vector<int> ans;
        for (int i = 0; i < nums.size(); ++i) {
            ans.push_back(nums[nums[i]]);
        }
        return ans;
    }
};
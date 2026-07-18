// Last updated: 7/18/2026, 9:25:21 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0)return true;
        return num%10!=0;
    }
}
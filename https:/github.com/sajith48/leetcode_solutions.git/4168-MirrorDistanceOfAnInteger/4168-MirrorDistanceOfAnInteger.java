// Last updated: 7/18/2026, 9:24:17 PM
class Solution {
    public int mirrorDistance(int n) {
        int temp = n;
        int rev=0;
        while(n!=0){
            rev = (rev*10)+n%10;
            n/=10;
        }
        return Math.abs(temp-rev);
    }
}
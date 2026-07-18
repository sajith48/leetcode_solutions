// Last updated: 7/18/2026, 9:24:55 PM
class Solution {
    public int commonFactors(int a, int b) {
        int count = 1;
        for(int i=2;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0)count++;
        }
        return count;
    }
}
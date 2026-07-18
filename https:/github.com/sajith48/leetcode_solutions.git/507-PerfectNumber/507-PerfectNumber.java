// Last updated: 7/18/2026, 9:27:27 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num%2!=0 || num<=0)return false;
        int sum=0,i=1;
        while(i<=num/2){
            if(num%i==0)sum+=i;
            i++;
        }
        return sum==num;
    }
}
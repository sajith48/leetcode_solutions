class Solution {
    public int subtractProductAndSum(int n) {
        int pd = 1;
        int sd = 0;
        int temp = n;
        while(temp!=0){
            sd+=temp%10;
            pd*=temp%10;
            temp/=10;
        }
        return pd-sd;
    }
}
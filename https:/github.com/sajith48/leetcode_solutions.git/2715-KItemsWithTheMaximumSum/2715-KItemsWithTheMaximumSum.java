// Last updated: 7/18/2026, 9:24:45 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum=0;
        while(k>0){
            k--;
            if(numOnes>0){
                sum+=1;
                numOnes--;
            }
            else if(numZeros>0){
                numZeros--;
            }
            else{
                sum-=1;
            numNegOnes++;
            }
        }
        return sum;
    }
}
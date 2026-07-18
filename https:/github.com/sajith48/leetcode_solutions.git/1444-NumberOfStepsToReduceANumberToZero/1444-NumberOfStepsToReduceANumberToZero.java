// Last updated: 7/18/2026, 9:26:01 PM
class Solution {
    public int numberOfSteps(int num) {
        int step = 0;
        while(num!=0){
            step++;
            if(num%2==0)num/=2;
            else num--;
        }
        return step;
    }
}
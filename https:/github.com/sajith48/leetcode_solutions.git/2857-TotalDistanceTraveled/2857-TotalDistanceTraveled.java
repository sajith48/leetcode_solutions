// Last updated: 7/18/2026, 9:24:38 PM
class Solution {
    public int distanceTraveled(int m, int a) {
        int totalfuel = 0;
        while(m>=5){
            m-=5;
            totalfuel+=5;
            if(a>=1){
                a-=1;
                m++;
            }
        }
        totalfuel+=m;
        return 10*totalfuel;
    }
}
// Last updated: 7/18/2026, 9:24:44 PM
class Solution {
    public int findDelayedArrivalTime(int a, int d) {
        int c=a+d;
        if(c>23)return c-24;
        else return c;
        
    }
}
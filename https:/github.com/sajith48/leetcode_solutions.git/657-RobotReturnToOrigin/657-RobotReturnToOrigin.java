// Last updated: 7/18/2026, 9:27:17 PM
class Solution {
    public boolean judgeCircle(String moves) {
        int n = 0,x = 0;
        for(char ch : moves.toCharArray()){
            if(ch=='U')n+=1;
            else if(ch=='D')n-=1;
            else if(ch=='L')x+=1;
            else if(ch=='R')x-=1;
        }
            return n==0 && x==0;
    }
}
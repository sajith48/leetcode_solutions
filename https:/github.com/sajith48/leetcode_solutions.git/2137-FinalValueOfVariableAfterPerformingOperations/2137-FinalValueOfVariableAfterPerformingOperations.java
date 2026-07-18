// Last updated: 7/18/2026, 9:25:28 PM
class Solution {
    public int finalValueAfterOperations(String[] s) {
        int x = 0;
        for(int i=0;i<s.length;i++){
            if(s[i].equals("--X") || s[i].equals("X--"))x--;
            else x++;
        }
        return x;
    }
}
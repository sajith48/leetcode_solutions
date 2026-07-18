// Last updated: 7/18/2026, 9:24:23 PM
class Solution {
    public long sumAndMultiply(int n) { 
        long x = 0;
        long sum = 0;
        String s = Integer.toString(n);

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!='0'){
                int dig = ch - '0';
                sum+=dig;
                x = x*10 + dig;
            }
        }
        return x*sum;
    }
}
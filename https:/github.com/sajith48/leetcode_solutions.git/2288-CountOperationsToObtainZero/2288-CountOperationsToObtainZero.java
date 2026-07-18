// Last updated: 7/18/2026, 9:25:06 PM
class Solution {
    public int countOperations(int num1, int num2) {
        int count = 0;
       while(num1!=0 && num2!=0){
        count++;
        if(num1<num2)num2-=num1;
        else  num1-=num2;
       } 
       return count;
    }
}
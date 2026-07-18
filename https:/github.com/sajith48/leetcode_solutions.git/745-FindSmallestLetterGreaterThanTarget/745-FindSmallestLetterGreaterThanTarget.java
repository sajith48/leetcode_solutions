// Last updated: 7/18/2026, 9:27:00 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char ch : letters){
            if(ch > target)return ch;
        }
        return letters[0];
    }
}
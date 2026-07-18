// Last updated: 7/18/2026, 9:25:30 PM
class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        if(index==-1)return word;
        else{
            for(int i=index;i>=0;i--){
                st.push(word.charAt(i));
            }
        }
        for(char a:st){
            sb.append(a);
        }
        sb.append(word.substring(index+1));
        return sb.toString();       
    }
}
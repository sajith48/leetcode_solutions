class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char a: s.toCharArray()){
            if(!st.isEmpty() && a == st.peek())st.pop();
            else st.push(a);
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
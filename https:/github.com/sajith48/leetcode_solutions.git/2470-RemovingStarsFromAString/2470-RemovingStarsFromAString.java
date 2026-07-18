// Last updated: 7/18/2026, 9:25:00 PM
class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

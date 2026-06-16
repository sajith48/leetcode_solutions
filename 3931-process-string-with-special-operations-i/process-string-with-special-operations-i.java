class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char a : s.toCharArray()) {
            if (Character.isAlphabetic(a)) {
                sb.append(a);
            } else if (a == '#') { 
                sb.append(sb.toString());
            } else if (a == '%') {
                sb.reverse();
            } else if (a == '*') {
                if (sb.length() > 0) { 
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }
        return sb.toString();
    }
}

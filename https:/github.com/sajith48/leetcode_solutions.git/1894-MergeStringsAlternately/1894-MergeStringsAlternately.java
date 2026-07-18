// Last updated: 7/18/2026, 9:25:48 PM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        char[] a = word1.toCharArray();
        char[] b = word2.toCharArray();
        while(i<a.length || i<b.length){
            if(i<a.length){
                sb.append(a[i]);
            }
            if(i<b.length){
                sb.append(b[i]);
            }
            i++;
        }
        return sb.toString();
    }
}
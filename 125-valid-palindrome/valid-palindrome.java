class Solution {
    public boolean isPalindrome(String s) {
        String cs = s.toLowerCase().replaceAll("[^a-z0-9]","");
        String ns = new StringBuilder(cs).reverse().toString();
        return cs.equals(ns);
    }
}
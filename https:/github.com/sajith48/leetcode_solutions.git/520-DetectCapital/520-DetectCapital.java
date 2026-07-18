// Last updated: 7/18/2026, 9:27:24 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch))
                count++;
        }
        return count == word.length() || count == 0 ||
                (count == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
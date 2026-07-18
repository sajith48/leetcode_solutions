// Last updated: 7/18/2026, 9:25:02 PM
class Solution {
public char repeatedCharacter(String s) {
    HashSet<Character> seen = new HashSet<>();
    for (char c : s.toCharArray()) {
        if (seen.contains(c)) {
            return c;
        }
        seen.add(c);
    }
    return ' ';
}
}
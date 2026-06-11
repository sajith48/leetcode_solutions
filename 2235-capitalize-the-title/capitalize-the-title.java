class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.toLowerCase().split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 2) {
                char[] chars = words[i].toCharArray();
                chars[0] = Character.toUpperCase(chars[0]);
                words[i]  = new String(chars);
            }
        }
        return String.join(" ", words);
    }
}

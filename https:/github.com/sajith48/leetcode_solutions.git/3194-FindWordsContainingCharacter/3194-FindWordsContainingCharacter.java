// Last updated: 7/18/2026, 9:24:34 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1)a.add(i);
        }
        return a;
    }
}
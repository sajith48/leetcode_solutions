// Last updated: 7/18/2026, 9:25:24 PM
class Solution {
public:
    int mostWordsFound(vector<string>& sentences) {
        int max_words = 0;
        for (const string& sentence : sentences) {
            int space_count = count(sentence.begin(), sentence.end(), ' ');
            int word_count = space_count + 1;
            if (word_count > max_words) {
                max_words = word_count;
            }
        }
        return max_words;
    }
};
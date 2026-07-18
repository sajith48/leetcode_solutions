// Last updated: 7/18/2026, 9:27:08 PM
class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char target){
        for(int i=0;i<letters.size();i++){
           if(letters[i]>target)return letters[i];
    }
    return letters[0];
    }
    };
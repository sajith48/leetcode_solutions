class Solution {
public:
    int strStr(string haystack, string needle) {
        int needle_len = needle.size();
        int haystack_len = haystack.size();
        
        if (needle_len == 0) {
            return 0;
        }
        if (haystack_len < needle_len) {
            return -1;
        }
        
        for (int i = 0; i <= haystack_len - needle_len; ++i) {
            bool match = true;
            for (int j = 0; j < needle_len; ++j) {
                if (haystack[i + j] != needle[j]) {
                   match = false;
                    break;
                }
            }
            if (match) {
                return i;
            }
        }
        return -1; 
    }
};
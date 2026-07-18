// Last updated: 7/18/2026, 9:27:28 PM
class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
    if (mat.empty() || mat[0].empty()) {
        return {};
    }
    
    int rows = mat.size();
    int cols = mat[0].size();
    map<int, vector<int>> diagonals;
    
    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            diagonals[i + j].push_back(mat[i][j]);
        }
    }
    
    
    
    vector<int> result;
    for (auto& [key, elements] : diagonals) {
        if (key % 2 == 0) {
            reverse(elements.begin(), elements.end());
        }
        result.insert(result.end(), elements.begin(), elements.end());
    }
    
    return result;
    }
};
// Last updated: 7/18/2026, 9:24:15 PM
class Solution {
    public String[] createGrid(int m, int n) {
        char[][] grid = new char[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(grid[i],'#');
        }
        for(int i=0;i<n;i++)grid[0][i] = '.';
        for(int i=0;i<m;i++)grid[i][n-1] = '.';
        String[] al = new String[m];
        for(int i=0;i<m;i++){
           al[i] = new String(grid[i]);
        }
        return al;
    }
}
// Last updated: 7/18/2026, 9:26:04 PM
class Solution {
    public int countNegatives(int[][] grid) {
        int neg=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]<0)neg+=1;
            }
        }
        return neg;
    }
}
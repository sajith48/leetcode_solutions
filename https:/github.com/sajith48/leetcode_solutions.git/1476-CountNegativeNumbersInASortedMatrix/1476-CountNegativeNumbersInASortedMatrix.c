// Last updated: 7/18/2026, 9:26:10 PM
int countNegatives(int** grid, int gridSize, int* gridColSize) {
    int c=0;
    for(int i=0;i<gridSize;i++){
        for(int j=0;j<*gridColSize;j++){
            if(grid[i][j]<0)c++;
        }
    }
    return c;
}
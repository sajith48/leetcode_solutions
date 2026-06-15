class Solution {
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0;
        
        // 1. Find all initial rotten oranges and count fresh ones
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }
        
        // If there are no fresh oranges, 0 minutes are needed
        if (freshOranges == 0) return 0;
        
        int minutes = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        // 2. Process the grid layer by layer (BFS)
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rottedAnyThisMinute = false;
            
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                
                for (int[] dir : directions) {
                    int nextRow = current[0] + dir[0];
                    int nextCol = current[1] + dir[1];
                    
                    // Check bounds and if the neighboring orange is fresh
                    if (nextRow >= 0 && nextRow < rows && nextCol >= 0 && nextCol < cols && grid[nextRow][nextCol] == 1) {
                        grid[nextRow][nextCol] = 2; // Rot the fresh orange
                        queue.offer(new int[]{nextRow, nextCol});
                        freshOranges--;
                        rottedAnyThisMinute = true;
                    }
                }
            }
            
            if (rottedAnyThisMinute) {
                minutes++;
            }
        }
        
        // 3. Return result based on remaining fresh oranges
        return freshOranges == 0 ? minutes : -1;
    }
}

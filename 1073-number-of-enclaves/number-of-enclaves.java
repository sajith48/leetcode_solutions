import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int numEnclaves(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        
        // Step 1: Find all land cells ('1's) on the boundaries and add them to the Queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Check if the cell is on the outer edge (border)
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    if (grid[i][j] == 1) {
                        queue.offer(new int[]{i, j});
                        grid[i][j] = 0; // Mark as visited by sinking it to 0
                    }
                }
            }
        }
        
        // Direction arrays to easily move Up, Down, Left, and Right
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        // Step 2: Process the queue to sink all land cells connected to the boundary
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int r = cell[0];
            int c = cell[1];
            
            // Check all 4 neighbor directions
            for (int[] dir : dirs) {
                int nr = r + dir[0];
                int nc = c + dir[1];
                
                // If neighbor is within bounds and is land ('1'), sink it and add to queue
                if (nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] == 1) {
                    grid[nr][nc] = 0; 
                    queue.offer(new int[]{nr, nc}); 
                }
            }
        }
        
        // Step 3: Count the remaining '1's that could not reach any boundary
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
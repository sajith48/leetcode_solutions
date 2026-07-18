// Last updated: 7/18/2026, 9:26:12 PM
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        // 1. Sort the array so that the minimum difference must be between neighbors
        Arrays.sort(arr);
        
        int minDiff = Integer.MAX_VALUE;
        int n = arr.length;
        
        // 2. First pass: Find the actual minimum absolute difference
        for (int i = 0; i < n - 1; i++) {
            minDiff = Math.min(minDiff, arr[i + 1] - arr[i]);
        }
        
        List<List<Integer>> result = new ArrayList<>();
        
        // 3. Second pass: Collect all adjacent pairs that match this minDiff
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] - arr[i] == minDiff) {
                // Using List.of() or Arrays.asList() for concise pair creation
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }       
        return result;
    }
}
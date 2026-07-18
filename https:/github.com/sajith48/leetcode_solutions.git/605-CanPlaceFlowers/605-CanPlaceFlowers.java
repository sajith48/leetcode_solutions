// Last updated: 7/18/2026, 9:27:21 PM
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 1; 
        int maxFlowers = 0;

        for (int plot : flowerbed) {
            if (plot == 0) {
                count++;
            } else {
                maxFlowers += (count - 1) / 2;
                count = 0; 
            }
        }
        
        count++; 
        maxFlowers += (count - 1) / 2;

        return maxFlowers >= n;
    }
}

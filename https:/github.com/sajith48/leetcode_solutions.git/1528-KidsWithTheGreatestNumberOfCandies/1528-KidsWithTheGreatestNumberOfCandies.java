// Last updated: 7/18/2026, 9:25:59 PM
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> al = new ArrayList<>();
        
        int maxCandies = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }
        
        for (int i = 0; i < candies.length; i++) {
            int sum = candies[i] + extraCandies;
            if (sum >= maxCandies) {
                al.add(true);
            } else {
                al.add(false);
            }
        }
        
        return al;
    }
}

// Last updated: 7/18/2026, 9:25:51 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int gsum = 0;
        for(int i=0;i<accounts.length;i++){
            int sum =0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            gsum = Math.max(sum,gsum);
        }
        return gsum;
    }
}
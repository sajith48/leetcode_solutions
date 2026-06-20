class Solution {
    public int minimumCost(int[] cost) {
        int c = 0;
        Arrays.sort(cost);
        for(int i=cost.length-1;i>=0;i--){
            c+=cost[i];
            i--;
            if(i>=0)c+=cost[i];
            i--;
        }
        return c;
    }
}
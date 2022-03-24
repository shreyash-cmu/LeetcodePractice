class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] minCosts = new int[n+1];
        minCosts[0]= 0;
        minCosts[1]= 0;
        for(int i=2;i<=cost.length;i++){
            minCosts[i] = Math.min(cost[i-1]+minCosts[i-1],cost[i-2]+minCosts[i-2]);
        }
        return minCosts[n];
    }
}
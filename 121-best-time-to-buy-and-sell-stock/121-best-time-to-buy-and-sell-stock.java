class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2) return 0;
        int profit = Integer.MIN_VALUE;
        int minPrice = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]< minPrice){
                minPrice = prices[i];
                //profit = 0;
            }
            profit = Math.max(prices[i]-minPrice, profit);
        }
        return profit;
    }
    
}
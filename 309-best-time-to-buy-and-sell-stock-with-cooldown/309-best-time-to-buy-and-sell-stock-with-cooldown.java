class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        Integer qb[][] = new Integer[n][2];
        
        return solve(0, prices, 1, qb);
    }
    
    int solve(int start, int prices[], int buy, Integer qb[][]){
        
        if(start >= prices.length) return 0;
        
        if(qb[start][buy] != null) return qb[start][buy];
        
        int profit = 0;
        
        
        
        if(buy == 1){
            profit = Math.max(-prices[start]+solve(start+1, prices, 0,qb),solve(start+1, prices, 1,qb));
        }
        else{
            profit = Math.max(prices[start]+solve(start+2, prices, 1,qb), solve(start+1, prices, 0,qb));
        }
        
        return qb[start][buy] = profit;
        
    }
}
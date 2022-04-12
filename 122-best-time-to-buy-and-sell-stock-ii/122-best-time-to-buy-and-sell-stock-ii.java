class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        Integer qb[][] = new Integer[n][2];
        return solve(0, 1, prices,qb);
    }
    
    int solve(int start, int buy, int prices[],Integer qb[][]){
        if(start == prices.length) return 0;
        if(qb[start][buy] != null) return qb[start][buy];
        
        int profit = 0;
        
        if(buy == 1){
            profit = Math.max(-prices[start]+solve(start+1, 0, prices,qb), 0 + solve(start+1, 1, prices,qb));
    }
        
    else{
        profit = Math.max(prices[start] + solve(start+1, 1, prices,qb), 0+solve(start+1, 0, prices,qb));
    }
        
        return qb[start][buy] = profit;
}
}

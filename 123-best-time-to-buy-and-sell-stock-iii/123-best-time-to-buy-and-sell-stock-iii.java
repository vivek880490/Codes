class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        Integer qb[][][] = new Integer[n][2][3];
        return solve(0, prices, 1 , 2, qb);
        
    }
    int solve(int start, int prices[], int buy, int allow,Integer qb[][][]){
        if(start == prices.length || allow == 0) return 0;        
        int profit = 0;
        
        if(qb[start][buy][allow] != null) return qb[start][buy][allow];
        
        if(buy == 1){
        profit = Math.max(-prices[start] + solve(start+1, prices, 0, allow, qb),solve(start+1, prices, 1, allow, qb)); 
            }
        
        else{
            profit = Math.max(prices[start] + solve(start+1, prices, 1, allow-1,qb),solve(start+1, prices, 0, allow, qb));
            
        }
        
        return qb[start][buy][allow] = profit;
    }
}
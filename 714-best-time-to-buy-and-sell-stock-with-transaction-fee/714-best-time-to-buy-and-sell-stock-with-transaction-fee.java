class Solution {
    public int maxProfit(int[] prices, int fee) {
        
         int n = prices.length;
        Integer qb[][] = new Integer[n][2];
        
        return solve(0, prices, 1,fee,qb);
    }
    
    int solve(int start, int prices[], int buy,int fee,Integer qb[][]){
        
        if(start >= prices.length) return 0;
        
        if(qb[start][buy] != null) return qb[start][buy];
        
        int profit = 0;
        
        
        
        if(buy == 1){
            profit = Math.max(-prices[start]+solve(start+1, prices, 0,fee,qb),solve(start+1, prices, 1,fee,qb));
        }
        else{
            profit = Math.max(prices[start]-fee+solve(start+1, prices, 1,fee,qb), solve(start+1, prices, 0,fee,qb));
        }
        
        return qb[start][buy] = profit;
        
    }
        
    }

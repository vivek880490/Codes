class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int n = cost.length;
        
        Integer qb [] = new Integer[n+1];
        
        return Math.min(solve(cost,n-1,qb),solve(cost,n-2,qb));
    }
    
    int solve(int cost[], int n, Integer qb[]){
        
        if(n < 0) return 0;
        
        if(n == 0 || n == 1) return cost[n];
        
        if(qb[n] != null) return qb[n];
        
        return qb[n]=cost[n]+Math.min(solve(cost,n-1,qb),solve(cost,n-2,qb));
        
    }
}
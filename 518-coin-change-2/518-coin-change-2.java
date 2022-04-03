class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        Integer qb[][] = new Integer[n+1][amount+1];
        return solve(n-1, amount, coins, qb);
    }
    
    int solve(int idx, int amount, int coins[], Integer qb[][]){
        if(idx == 0) {
            if(amount%coins[0]==0)return 1;
            else return 0;
        }
        
        if(qb[idx][amount] != null) return qb[idx][amount];
        
        int nottake = solve(idx-1, amount, coins,qb);
        int take = 0;
        if(coins[idx] <= amount) take = solve(idx, amount-coins[idx],coins,qb);
        
        return qb[idx][amount] = take+nottake;
    }
}
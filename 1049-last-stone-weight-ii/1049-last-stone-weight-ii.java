class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for(int x : stones){
            sum += x;
        }
        
        Integer dp[][] = new Integer[stones.length+1][sum+1];
        
        return solve(stones, 0, 0, 0, dp);
    }
    
    int solve(int stones[], int start, int rs, int ls, Integer dp[][]){
        if(start == stones.length){
            return Math.abs(ls-rs);
        }
        
        if(dp[start][rs] != null) return dp[start][rs];
        
        dp[start][rs] = Math.min(solve(stones, start+1, rs+stones[start],ls,dp),solve(stones, start+1, rs, ls+stones[start],dp));
        
        return dp[start][rs];
    }
    
}
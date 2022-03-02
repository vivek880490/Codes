class Solution {
    public int calculateMinimumHP(int[][] grid) {
        
        Integer dp[][]=new Integer[grid.length+1][grid[0].length+1];
        return solve(0,0,grid,dp);
        
    }
    int solve(int i,int j,int grid[][],Integer dp[][]){
       if(dp[i][j]!=null) return dp[i][j];
        if(i>=grid.length || j>=grid[0].length) return Integer.MAX_VALUE;
        
        int health = Math.min(solve(i+1,j,grid,dp),solve(i,j+1,grid,dp));
        
        if(health==Integer.MAX_VALUE){
            health=1;
        }
         if(health-grid[i][j]>0){
            return dp[i][j]=health-grid[i][j];
        }
        else{
            return dp[i][j]=1;
        }
        
        
    }
}
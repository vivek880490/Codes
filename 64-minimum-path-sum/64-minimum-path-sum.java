class Solution {
    public int minPathSum(int[][] grid) {
        
        
        int m = grid.length-1;
        int n = grid[0].length-1;
        Integer qb[][] = new Integer[m+1][n+1];
        
        return solve(grid,m, n, qb);
        
    }
    
    int solve(int grid[][], int sr, int sc, Integer qb[][]){
        if(sr == 0 && sc == 0) return grid[sr][sc];
        
        if(sr == 0) return grid[sr][sc] + solve(grid, sr, sc-1, qb);
        
        if(sc == 0) return grid[sr][sc] + solve(grid, sr-1, sc, qb);
        
        if(qb[sr][sc] != null) return qb[sr][sc];
            
        int down = grid[sr][sc]+Math.min(solve(grid, sr-1, sc, qb),solve(grid, sr, sc-1, qb));
        
        return qb[sr][sc] = down;
        
    }
}
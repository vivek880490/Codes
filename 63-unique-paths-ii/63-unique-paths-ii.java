class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        Integer qb[][] = new Integer[m+1][n+1];
        
       return solve(grid,0,0,m-1,n-1,qb);
        
    }
    
    int solve(int grid[][],int i,int j,int dr,int dc,Integer qb[][]){
        if(i>=grid.length || j>=grid[0].length || grid[i][j]==1) return 0;
        
        if(i==dr && j==dc) return 1;
        
        if(qb[i][j]!=null){
            return qb[i][j];
        }
        
        int s1 = solve(grid,i+1,j,dr,dc,qb);
        int s2 = solve(grid,i,j+1,dr,dc,qb);
        
        return qb[i][j]=s1+s2;
        
        
        
    }
}
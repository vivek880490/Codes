class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        Integer qb[][] = new Integer[m][n];
        
        return solve(obstacleGrid, 0, 0, m-1, n-1,qb);
    }
    int solve(int[][] obstacleGrid, int sr, int sc, int dr, int dc,Integer qb[][]){
        
        if(sr > dr || sc > dc || obstacleGrid[sr][sc] == 1) return 0;
        
        if(sr == dr && sc == dc) return 1;
        
        if(qb[sr][sc] != null) return qb[sr][sc];
        
        int down = solve(obstacleGrid, sr+1, sc, dr, dc, qb);
        int right = solve(obstacleGrid, sr, sc+1, dr, dc, qb);
        
        return qb[sr][sc] = down+right;
    }
}
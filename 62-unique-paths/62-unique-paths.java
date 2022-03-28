class Solution {
    public int uniquePaths(int m, int n) {
        Integer qb[][] = new Integer[m][n];
        return solve(0,0,m-1,n-1,qb);
        
    }
    
    int solve(int sr, int sc, int dr, int dc, Integer qb[][]){
        if(sr > dr || sc > dc) return 0;
        if(sr == dr && sc == dc) return 1;
        
        if(qb[sr][sc] != null) return qb[sr][sc];
        
        int down = solve(sr+1, sc, dr, dc, qb);
        int right = solve(sr, sc+1, dr, dc, qb);
        
        return qb[sr][sc] = down+right;
    }
}
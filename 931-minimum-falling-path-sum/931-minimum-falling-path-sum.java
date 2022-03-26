class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        Integer qb[][] =  new Integer[m][n];
        
        int ans = Integer.MAX_VALUE;
        
        for(int j=0; j<n; j++){
            ans = Math.min(ans, solve(0, j, m-1 ,n-1 , matrix, qb));
        }
        return ans;
        
    }
    int solve(int i, int j, int m, int n, int matrix[][], Integer qb[][]){
        if(i < 0 || j < 0 || i > m || j > n  ) return Integer.MAX_VALUE;
        if(i == m) return matrix[i][j];
        
        if(qb[i][j]!= null) return qb[i][j];
        
        int dl = solve(i+1, j-1, m, n, matrix,qb);
        int dr = solve(i+1, j+1, m, n, matrix,qb);
        int db = solve(i+1, j, m, n, matrix,qb);
        
        return qb[i][j] = matrix[i][j] + Math.min(dl, Math.min(dr,db));
    }
}
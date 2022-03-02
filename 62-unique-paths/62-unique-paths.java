class Solution {
    public int uniquePaths(int m, int n) {
        Integer qb[][]=new Integer[m+1][n+1];
        return solve(0,0,m,n,qb);
        
    }
    int solve(int i,int j,int dr,int dc,Integer qb[][]){
       
        if(qb[i][j]!=null) return qb[i][j];
        
        if(i>=dr || j>=dc) return 0;
         if(i==dr-1 && j==dc-1) return 1;
        
        
        int m1=solve(i+1,j,dr,dc,qb);
        int m2=solve(i,j+1,dr,dc,qb);
        qb[i][j]=m1+m2;
        return qb[i][j];
    }
}
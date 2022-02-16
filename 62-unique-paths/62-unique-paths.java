class Solution {
    public int uniquePaths(int m, int n) {
        int qb[][]=new int[m][n];
        return solve(0,0,m,n,qb);
        
        
    }
    int solve(int i,int j,int m,int n,int qb[][]){
       
        if(i>=m || j>=n) return 0;
         if(qb[i][j]!=0) return qb[i][j];
        
        if(i==m-1 && j==n-1) return 1;
        
        int count1=solve(i+1,j,m,n,qb);
        int count2=solve(i,j+1,m,n,qb);
        
        qb[i][j] = count1+count2;
        return qb[i][j];
    }
}
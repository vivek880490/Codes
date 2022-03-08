class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int n = text1.length();
        int m = text2.length();
        
        Integer qb[][] = new Integer[n+1][m+1];
        
        return solve(text1, text2, n, m,n-1,m-1,0,qb);
    }
    
    int solve(String text1, String text2, int n, int m,int i, int j,int ans,Integer qb[][]){
        
        if(n==0 || m==0 ) return 0;
        
        if(qb[i][j] != null) return qb[i][j];
        
        if(text1.charAt(i) == text2.charAt(j)){
            qb[i][j] = 1 + solve(text1, text2, n-1, m-1, i-1, j-1,ans,qb);
        }
        
        else{
            qb[i][j] = Math.max(solve(text1, text2, n-1,m,i-1,j,ans,qb),solve(text1, text2, n, m-1,i,j-1,ans,qb));
        }
        
        return qb[i][j];
        
    }
    
}
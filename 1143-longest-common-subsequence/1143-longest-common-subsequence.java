class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int n = text1.length();
        int m = text2.length();
        
        Integer qb[][] = new Integer[n+1][m+1];
        
        return solve(text1, text2, n, m,qb);
    }
    
    int solve(String text1, String text2, int n, int m,Integer qb[][]){
        
        if(n==0 || m==0 ) return 0;
        
        if(qb[n-1][m-1] != null) return qb[n-1][m-1];
        
        if(text1.charAt(n-1) == text2.charAt(m-1)){
            qb[n-1][m-1] = 1 + solve(text1, text2, n-1, m-1,qb);
        }
        
        else{
            qb[n-1][m-1] = Math.max(solve(text1, text2, n-1,m,qb),solve(text1, text2,n,m-1,qb));
        }
        
        return qb[n-1][m-1];
        
    }
    
}
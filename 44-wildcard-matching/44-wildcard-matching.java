class Solution {
    public boolean isMatch(String s, String t) {
        
         int n = t.length();
         int m = s.length();
    
    Boolean dp[][] = new Boolean[n+1][m+1];
    
    return func(n,m,t,s,dp);
        
    }
    
    boolean func(int i, int j, String t, String s, Boolean dp[][]){
        
     if(i==0 && j==0) return true;
    if(i==0 && j>0) return false;
    if(j==0 && i>0){
        for(int k=1;k<=i;k++){
            if(t.charAt(k-1) != '*') return false;
        }
        return true;
    }
    if(dp[i][j] != null) return dp[i][j];

    //if they matched
    if(t.charAt(i-1) == s.charAt(j-1) || t.charAt(i-1)=='?') return dp[i][j] = func(i-1,j-1,t,s,dp);

    // if They DO NOT match
    if(t.charAt(i-1) == '*'){
        return dp[i][j] = func(i-1,j,t,s,dp) || func(i,j-1,t,s,dp);
    }

    return dp[i][j] = false;// (a == b) no thats why false;
}
}
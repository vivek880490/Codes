class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int dp[][] = new int[s.length()+1][t.length()+1];
        
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        
        
        int len = dp[dp.length-1][dp[0].length-1];
        
        if(len == s.length()) return true;
        return false;
        
    }
}
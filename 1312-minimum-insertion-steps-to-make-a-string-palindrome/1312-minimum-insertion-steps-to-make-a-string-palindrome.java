class Solution {
    public int minInsertions(String str) {
        
        StringBuilder sb = new StringBuilder(str);
        
        sb.reverse();
        
        String t = sb.toString();
        
        int dp[][] = new int[str.length()+1][str.length()+1];
        
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                
                if(str.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        int len = dp[dp.length-1][dp[0].length-1];
        
        int ans = str.length() - len;
        
        return ans;
    }
}
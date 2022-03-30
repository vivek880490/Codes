class Solution {
    public String longestPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        
        sb.reverse();
        String t = sb.toString();
        
        
        int dp[][] = new int[s.length()+1][s.length()+1];
        int res = 0;
        String ans = "";
        
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = 0;
                }
                
                if(res < dp[i][j]){
                  String temp = s.substring(i-dp[i][j], i-dp[i][j]+dp[i][j]);
                    StringBuilder rev = new StringBuilder(temp);
                    rev.reverse();
                    String reve = rev.toString();
                    
                    if(reve.equals(temp)){
                        ans = temp;
                        res = dp[i][j];
                    }
                }
            }
        }
        return ans;
        
    }
}
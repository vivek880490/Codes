class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        
        int dp[][] = new int[str1.length()+1][str2.length()+1];
        
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] =  1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        int r = dp.length-1;
        int c = dp[0].length-1;
        
        StringBuilder sb = new StringBuilder();
        
        while(r > 0 && c > 0){
            if(str1.charAt(r-1) == str2.charAt(c-1)){
                sb.append(str1.charAt(r-1));
                r--;
                c--;
            }
            else{
                if(dp[r-1][c] > dp[r][c-1]){
                    sb.append(str1.charAt(r-1));
                    r--;
                }
                else{
                    sb.append(str2.charAt(c-1));
                    c--;
                }
            }
        }
        
        while(r > 0){
            sb.append(str1.charAt(r-1));
            r--;
        }
        
        while(c > 0){
            sb.append(str2.charAt(c-1));
            c--;
        }
        sb.reverse();
        return sb.toString();
    }
}
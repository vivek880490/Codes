class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int n = text1.length();
        int m = text2.length();
        
        int qb[][] = new int[n+1][m+1];
        
        for(int i=1; i<qb.length; i++){
            
            for(int j=1; j<qb[0].length; j++){
                
                if(text1.charAt(i-1) == text2.charAt(j-1))
                {
                 qb[i][j] = 1 + qb[i-1][j-1];
             }
                else{
                    
                    qb[i][j] = Math.max(qb[i-1][j],qb[i][j-1]);
                    
                }
                
            }
        }
        
        return qb[n] [m];
    }
    
}
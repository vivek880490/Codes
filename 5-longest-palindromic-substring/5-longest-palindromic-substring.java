class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        boolean dp[][]=new boolean[s.length()][s.length()];
        // for gap that is diagnol
        for(int g=0;g<s.length();g++){
            for(int i = 0 , j = g ; j<s.length() ;i++,j++){
                // one length string is always palindrome
                if(g==0){
                    dp[i][j]=true;
                }
                // two length is palindrome of both character are same
                else if(g==1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j] = true;
                    }
                    else{
                        dp[i][j] = false;
                    }
                }
                else{
                    // check if extreme means first and last character same same and middel are also palindrome
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true){
                        dp[i][j]  = true;
                    }
                    else{
                        dp[i][j] = false;
                    }
                    
                }
                // at every gap we will check for the len of valid substring that are plaindrome
                if(dp[i][j]==true){
                    ans = s.substring(i,j+1);
                }
                
            }
        }
        
        return ans;
    }
}
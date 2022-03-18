class Solution {
    public String longestPalindrome(String s) {
        String s1=s;
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
    
        String ans="";
       int n=s.length();
        int res=0;
      int dp[][] = new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0)
                    dp[i][j]=0;
               else if(s.charAt(i-1)==s1.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                   
                   
                }
                else
                    dp[i][j]=0;
                
                 if(dp[i][j]>res)
                    {
                        String temp=s.substring(i-dp[i][j],i-dp[i][j]+dp[i][j]);
                        
                     StringBuilder sb1 = new StringBuilder(temp);
                     sb1.reverse();
                     String rev = sb1.toString();
                        if(temp.equals(rev)){    //check if common substring is palindromic or not
                             ans=temp;
                        res=dp[i][j];
                        }
                           
                    }
            }
            
        }
        return ans;
    }
}
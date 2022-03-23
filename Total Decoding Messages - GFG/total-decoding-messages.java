// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.CountWays(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int CountWays(String s)
    {
        // code here
        int m = 1000000007;
        
        if(s.charAt(0)=='0') return 0;
        
        int dp [] = new int [s.length()];
        
        dp[0] = 1;
        
        for(int i = 1; i < s.length(); i++){
            char chi = s.charAt(i);
            char ch = s.charAt(i-1);
            
            if(ch == '0' && chi == '0'){
                
                dp[i] = 0;
            }
             else if( ch == '0' && chi != '0'){
                dp[i] = (dp[i-1]) % m;
                
            }
            
            else if(ch !='0' && chi == '0'){
                if(ch == '1' || ch == '2'){
                    dp[i] = (i>=2?dp[i-2]:1) % m;
                }
                else{
                    dp[i] = 0;
                }
                
                
            }
           
            else{
               
                if(Integer.parseInt(s.substring(i-1,i+1))<=26){
                    dp[i] = (dp[i-1]+(i>=2?dp[i-2]:1)) % m;
                }
                else{
                    dp[i] = (dp[i-1]) % m;
                }
                
                
            }
        }
        return dp[s.length()-1];
        
    }
}
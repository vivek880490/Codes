// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum=0;
        for(int x: arr){
            sum+=x;
        }
        
        if(sum%2==1) return 0;
        sum=sum/2;
        
        boolean ans=subsetsum(sum,arr);
        
        return ans==false?0:1;
    }
    
     static boolean subsetsum(int sum,int arr[]){
        int n = arr.length;
        boolean dp[][]=new boolean [n+1][sum+1];
        
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0 & j==0){
                    dp[i][j] = true;
                }
                else if(i==0 && j!=0){
                    dp[i][j] = false;
                }
                else if(j==0 && i!=0){
                    dp[i][j] = true;
                }
                else{
                    if(arr[i-1]<=j){
                        dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                    }
                    else{
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }
        return dp[n][sum];
        
        
    }
}
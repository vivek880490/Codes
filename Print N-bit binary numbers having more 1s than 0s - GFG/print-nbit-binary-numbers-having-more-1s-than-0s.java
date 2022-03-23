// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<String> result = ob.NBitBinary(n);
            for(String value  : result){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<String> NBitBinary(int n) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        
        int one = 0;
        int zero = 0;
        
        String op = "";
        
        solve(n, one, zero, op, ans);
        
        return ans;
    }
    
    void solve(int n, int one, int zero,String op, ArrayList<String>al){
        
        if(n == 0){
            al.add(op);
            return;
        }
        
        String op1 = op;
        op1 += '1';
        solve(n-1, one+1, zero, op1, al);
        
        if(one > zero){
            String op2 = op;
            op2 += '0';
            solve(n-1, one, zero+1, op2, al);
            return;
        }
        
    }
}
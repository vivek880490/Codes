// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine().trim();
            Solution ob = new Solution();
            ArrayList<String> ans = new ArrayList<String>();
            ans = ob.permutation(S);
            
            for(int i=0;i<ans.size();i++){
                System.out.print("("+ans.get(i)+")");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution{
    
    ArrayList<String> permutation(String s){
        // Code Here
        ArrayList<String> al = new ArrayList<>();
        String in = s;
        
        String op = "";
        
        op += s.charAt(0);
        
        in = s.substring(1);
        
        solve(in, op , al);
        
        return al;
    }
    
    void solve(String in, String op, ArrayList<String>al){
        
        if(in.length() == 0) {
            al.add(op); 
            return;
            
        }
        
        String op1 = op;
        String op2 = op;
        
        op1 += " ";
        op1 += in.charAt(0);
        op2 += in.charAt(0);
        
        in = in.substring(1);
        
        solve(in, op1, al);
        solve(in, op2, al);
        
        return;
        
        
        
        
    }
    
}
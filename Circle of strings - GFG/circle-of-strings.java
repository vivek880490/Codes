// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine().trim());
		while(t-->0){
		    String A[] = in.readLine().trim().split(" ");
		    int N = Integer.parseInt(A[0]);
		    A = in.readLine().trim().split(" ");
		    
		    Solution ob = new Solution();
		    System.out.println(ob.isCircle(N, A));
		}
    }
}// } Driver Code Ends


// User function Template for Java

class Solution
{
    static int isCircle(int n, String A[])
    {
        // code here
        
        int indegree[] = new int[26];
        int outdegree[] = new int[26];
        
        HashMap<Character,ArrayList<Character>> map = new HashMap<>();
        
        for(String x : A){
            char f = x.charAt(0);
            char l = x.charAt(x.length()-1);
            
            if(map.containsKey(f) == false)
                map.put(f, new ArrayList<>());
            
            map.get(f).add(l);
            indegree[l-'a']++;
            outdegree[f-'a']++;
            
        }
        
        for(int i=0; i<26; i++){
            if(indegree[i] != outdegree[i]) return 0;
        }
        
        HashSet<Character> vis = new HashSet<>();
        
        return solve(map, vis, A[0].charAt(0))?1:0;
        
        
    }
    
    static boolean solve(HashMap<Character,ArrayList<Character>> map, HashSet<Character>vis, char ch){
        if(vis.contains(ch)){
            return vis.size() == map.size();
        }
        
        vis.add(ch);
        
        for(char c : map.get(ch)){
            if(solve(map,vis,c)) return true;
        }
        
        return false;
    }
}
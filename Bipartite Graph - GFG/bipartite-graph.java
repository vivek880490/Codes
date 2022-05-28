// { Driver Code Starts
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
            String[] S = br.readLine().trim().split(" ");
            int V = Integer.parseInt(S[0]);
            int E = Integer.parseInt(S[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for(int i = 0; i < V; i++){
                adj.add(new ArrayList<Integer>());
            }
            for(int i = 0; i < E; i++){
                String[] s = br.readLine().trim().split(" ");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isBipartite(V, adj);
            if(ans)
                System.out.println("1");
            else System.out.println("0");
       }
    }
}// } Driver Code Ends


class Solution
{
    public boolean isBipartite(int v, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int vis[] = new int[v];
        Arrays.fill(vis, -1);
        
        for(int i=0; i<v; i++){
            if(vis[i] == -1){
                boolean res = solve(adj, vis, i);
                
                if(res == false) return false;
            }
        }
        
        return true;
    }
    
    
    boolean solve(ArrayList<ArrayList<Integer>>adj, int vis[], int i){
        Queue<int[]> q = new LinkedList<>();
        
        q.add(new int[]{i, 0});
        
        while(q.size() > 0){
            
            int rem[] = q.poll();
            
            if(vis[rem[0]] != -1){
                if(rem[1] != vis[rem[0]]){
                    return false;
                }
            }
            else{
                vis[rem[0]] = rem[1];
            }
            
            ArrayList<Integer> nbr = adj.get(rem[0]);
            
            for(int x : nbr){
                if(vis[x] == -1){
                    q.add(new int[]{x, rem[1]+1});
                }
            }
        }
        
        return true;
    }
}
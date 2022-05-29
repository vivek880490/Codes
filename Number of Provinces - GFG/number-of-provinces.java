// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> nums, int v) {
        // code here
        boolean vis[]=new boolean[nums.size()];
        int count=0;
        for(int i=0;i<nums.size();i++){
            if(vis[i]==false){
            dfs(nums,i,vis);
            count++;
        }
        }
        return count;
    }
    
    static void dfs(ArrayList<ArrayList<Integer>> nums,int i,boolean vis[]){
        for(int j=0;j<nums.size();j++){
            if(nums.get(i).get(j)==1 && vis[j]==false){
                vis[j]=true;
                dfs(nums,j,vis);
            }
        }
    }
};
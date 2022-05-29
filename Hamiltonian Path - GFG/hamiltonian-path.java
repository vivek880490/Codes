// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int M = Integer.parseInt(input_line[1]);
            
            input_line = read.readLine().trim().split("\\s+");
            ArrayList<ArrayList<Integer>> Edges = new ArrayList<ArrayList<Integer>>(); 
            for(int i = 0; i < M; i++){
                ArrayList<Integer> e = new ArrayList<Integer>();
                e.add(Integer.parseInt(input_line[2*i]));
                e.add(Integer.parseInt(input_line[2*i+1]));
                Edges.add(e);
            }
            Solution ob = new Solution();
            if(ob.check(N, M, Edges)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    } 
} // } Driver Code Ends


//User function Template for Java
class Solution { 
    static ArrayList<ArrayList<Integer>> adj;
    static int vertex;
    static boolean DFS(int src, boolean[] visited, int counter){
        if(counter == vertex) return true;
        visited[src] = true;
        
        for(Integer item: adj.get(src)){
            if(!visited[item] && DFS(item, visited, counter+1)){
                return true;
            }
        }
        
        visited[src] = false;
        return false;
        
    }
    
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges) { 
        // code here
        adj = new ArrayList<>();
        vertex = N;
        
        for(int i = 0; i <= N; i++){
            adj.add(new ArrayList<>());
        }
        
        for(ArrayList<Integer> sub : Edges){
            int src = sub.get(0);
            int dest = sub.get(1);
            adj.get(src).add(dest);
            adj.get(dest).add(src);
        }
        
        boolean[] visited = new boolean[N+1];
        for(int i = 1; i < N+1; i++){
            if(!visited[i] && DFS(i, visited, 1)) return true;
        }
        
        return false;
    }
}
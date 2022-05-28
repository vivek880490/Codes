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
            int n = Integer.parseInt(br.readLine().trim());
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            boolean ans = obj.is_Possible(grid);
            if(ans)
                System.out.println("1");
            else 
                System.out.println("0");
        }
    }
}// } Driver Code Ends




class Solution
{
    //Function to find whether a path exists from the source to destination.
    public boolean is_Possible(int[][] grid)
    {
        // Code here
        Queue<int[]> q = new LinkedList<>();
        boolean vis[][] = new boolean[grid.length][grid[0].length];
        int dest[] = new int[2];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    q.add(new int[]{i,j});
                    vis[i][j] = true;
                }
                if(grid[i][j] == 2){
                    dest[0] = i;
                    dest[1] = j;
                }
            }
        }
        
        int dirs[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        
        
        while(q.size() > 0){
            
            int rem[] = q.poll();
            
            if(rem[0] == dest[0] && rem[1]  == dest[1]){
                return true;
            }
            
            for(int i=0; i<4; i++){
                int dx = rem[0] + dirs[i][0];
                int dy = rem[1] + dirs[i][1];
                
                if(dx >=0  && dy >=0  && dx < grid.length && dy < grid[0].length && grid[dx][dy]!=0 && vis[dx][dy] == false){
                    q.add(new int[]{dx,dy});
                    vis[dx][dy] = true;
                }
            }
            
        }
        
        return false;
    }
}
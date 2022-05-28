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
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.minimumCostPath(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return the minimum cost to react at bottom
	//right cell from top left cell.
    public int minimumCostPath(int[][] grid)
    {
        // Code here
        
       PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[2]-b[2]));
       
       pq.add(new int[]{0,0,grid[0][0]});
       
       boolean vis[][] = new boolean[grid.length][grid.length];
       
       while(pq.size() > 0){
           int rem[] = pq.poll();
           
           int x = rem[0];
           int y = rem[1];
           int w = rem[2];
           
           if(vis[x][y] == true) continue;
           
           if(x == grid.length-1 && y == grid.length-1) return w;
           vis[x][y] = true;
           
           int dirs[][] = {{-1,0},{0,-1},{1,0},{0,1}};
           
           for(int k=0; k<4; k++){
               
               int dx = x + dirs[k][0];
               int dy = y + dirs[k][1];
               
               if(dx >=0 && dy >=0 && dx < grid.length && dy < grid.length){
                   pq.add(new int[]{dx,dy,w+grid[dx][dy]});
               }
           }
        
       }
       
       return -1;
       
   }
}
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
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.findMaxArea(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to find unit area of the largest region of 1s.
    public int findMaxArea(int[][] grid)
    {
        // Code here
        Queue<int[]> q = new LinkedList<>();
        boolean vis[][] = new boolean[grid.length][grid[0].length];
         int dirs[][] = {{0,-1},{-1,0},{1,0},{0,1},{1,1},{1,-1},{-1,1},{-1,-1}};
         int max = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    q.add(new int[]{i,j});
                    vis[i][j] = true;
          
       
        int count = 1;
        
        while(q.size() > 0){
           
            
               int rem[] = q.poll();
            
            
            for(int k=0; k<8; k++){
                int dx = rem[0] + dirs[k][0];
                int dy = rem[1] + dirs[k][1];
                
                if(dx >= 0 && dy >=0  && dx < grid.length && dy < grid[0].length && grid[dx][dy] == 1 && vis[dx][dy] == false){
                    q.add(new int[]{dx,dy});
                    vis[dx][dy] = true;
                    count++;
                }
            }
        }
             max = Math.max(count,max);
            }
            }
            
        }
        
        return max;
    }
}
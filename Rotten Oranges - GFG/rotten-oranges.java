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
            int ans = obj.orangesRotting(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        // Code here
        Queue<int[]> q = new LinkedList<>();
        
        int fresh = 0;
        
        for(int i=0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        
        if(fresh == 0) return 0;
        int time = -1;
        int dirs[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        while(q.size() > 0 ){
         time++;
         int size = q.size();
         
         while(size -- > 0){
            int rem[] = q.poll();
            
            for(int i=0; i<4; i++){
                int rd = rem[0] + dirs[i][0];
                int cd = rem[1] + dirs[i][1];
                
                if(rd >= 0 && cd >=0  && rd < grid.length && cd < grid[0].length && grid[rd][cd] == 1){
                    q.add(new int[]{rd,cd});
                    grid[rd][cd] = 0;
                    fresh--;
                }
            }
         }
        }
        
        if(fresh == 0) return time;
        return -1;
        
    }
}
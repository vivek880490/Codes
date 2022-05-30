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
            int N = Integer.parseInt(br.readLine().trim());
            String[] S1 = br.readLine().trim().split(" ");
            String[] S2 = br.readLine().trim().split(" ");
            int[] KnightPos = new int[2];
            int[] TargetPos = new int[2];
            for(int i = 0; i < 2; i++){
                KnightPos[i] = Integer.parseInt(S1[i]);
                TargetPos[i] = Integer.parseInt(S2[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minStepToReachTarget(KnightPos, TargetPos, N);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends




class Solution
{
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int n)
    {
        // Code here
        Queue<int[]> q = new LinkedList<>();
        
        boolean vis[][] = new boolean[n+1][n+1];
        
        q.add(new int[]{KnightPos[0],KnightPos[1]});
        
        vis[KnightPos[0]][KnightPos[1]] = true;
        int[][] moves = { { 1, 2 }, { 2, 1 }, { -1, 2 }, { 1, -2 }, { -2, 1 }, { 2, -1 }, { -1, -2 }, { -2, -1 } };
        int count = 0;
        int min = Integer.MAX_VALUE;
        while(q.size() > 0){
            int size = q.size();
            
            
            while(size --> 0){
                int rem [] = q.poll();
                
                if(rem[0] == TargetPos[0] && rem[1] == TargetPos[1]) return count;
                
                for(int i=0; i<8; i++){
                    int dx = rem[0] + moves[i][0];
                    int dy = rem[1] + moves[i][1];
                    
                    if(dx >= 1 && dy >= 0 && dx <= n && dy <= n && vis[dx][dy] == false){
                        vis[dx][dy] = true;
                        
                        q.add(new int[]{dx,dy});                    }
                }
                min = Math.min(min, count);
            }
           count++; 
            
        }
        
        return -1;
    }
    
}
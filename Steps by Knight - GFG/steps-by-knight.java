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
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int n)
    {
        // Code here
        Queue<int[]> q = new LinkedList<>();
        
        boolean vis[][] =  new boolean[n+1][n+1];
        
        q.add(new int[]{KnightPos[0],KnightPos[1]});
        
        vis[KnightPos[0]][KnightPos[1]] = true;
        
        int level = 0;
        int[][] moves = { { 1, 2 }, { 2, 1 }, { -1, 2 }, { 1, -2 }, { -2, 1 }, { 2, -1 }, { -1, -2 }, { -2, -1 } };
        while(q.size() > 0){
            int size = q.size();
            while(size -- > 0){
                int rem[] = q.poll();
                
                if(rem[0] == TargetPos[0] && rem[1] == TargetPos[1]) return level;
                
                
                for (int move = 0; move < moves.length; move++) {
							int nr = rem[0] + moves[move][0];
							int nc = rem[1] + moves[move][1];
							if (nr > 0  && nr <= n && nc > 0 && nc <= n && vis[nr][nc] == false) {
							    vis[nr][nc] = true;
								q.add(new int[]{nr,nc});
							}
						}
                
            }
            level++;
        }
        return -1;
        
        }
}
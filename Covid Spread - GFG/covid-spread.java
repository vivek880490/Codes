// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        while(t-- > 0)
        {
            
            
            int R = sc.nextInt();
            
            int C = sc.nextInt();
            
           
            
            int hospital[][] = new int[R][C];
            
            int cnt=0;
            for(int i = 0; i < R; i++)
                {
                    for(int j=0; j < C; j++)
                {
                    hospital[i][j] = sc.nextInt();
                }
                    
                }
            
            Solution ob = new Solution();
            System.out.println(ob.helpaterp(hospital));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
     public int helpaterp(int[][] arr) {
        // code here
        int fresh = 0;
        Queue<int[]> q = new LinkedList<>();
        
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == 2){
                    q.add(new int[]{i,j});
                }
                else if(arr[i][j] == 1){
                    fresh++;
                }
            }
        }
        
        if(fresh == 0) return 0;
        int dirs[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        int time = -1;
        int count = 0;
        
        while(q.size() > 0){
            
            int size = q.size();
            time++;
            while(size --> 0) {
                
                int rem[] = q.poll();
                
                
                
                
                for(int i=0; i<4; i++){
                    int dx = rem[0] + dirs[i][0];
                    int dy = rem[1]  + dirs[i][1];
                    
                    if(dx >= 0 && dy >= 0 && dx < arr.length && dy < arr[0].length && arr[dx][dy] == 1){
                        q.add(new int[]{dx,dy});
                        arr[dx][dy] = 0;
                        fresh--;
                    }
                }
            } 
            
            
            
        }
        
        if(fresh == 0) return time;
        return -1;
    }
}

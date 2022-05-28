// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main(String args[]) throws IOException
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
		while(t>0)
		{
		    int N = sc.nextInt();
		    int P = sc.nextInt();
		    int prerequisites[][] = new int[P][2];
		    for(int i=0;i<P;i++)
		    {
		        for(int j=0;j<2;j++)
		        {
		            prerequisites[i][j] = sc.nextInt();
		        }
		    }
			Solution ob = new Solution();
			if(ob.isPossible(N,prerequisites))
			{
			    System.out.println("Yes");
			}
			else{
			    System.out.println("No");
			}
			t--;
		}
	}
	
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public boolean isPossible(int n, int[][] prerequisites)
    {
        // Your Code goes here
        int indegree[] = new int[n];
        int p = prerequisites.length;
        List<List<Integer>> al = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            al.add(new ArrayList<>());
        }
        
        for(int i=0; i<p; i++){
            al.get(prerequisites[i][0]).add(prerequisites[i][1]);
            indegree[prerequisites[i][1]]++;
        }
       
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<n; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
int count = 0;
        while(q.size() > 0){
            
            int rem = q.poll();
            count++;
            
            List<Integer> bl = al.get(rem);
            
            for(int x : bl){
                indegree[x]--;
                
                if(indegree[x] == 0) q.add(x);
            }
                
                
            
        } 
        
        return count==n;
        
    } 
    
}
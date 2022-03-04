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
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        int arr[][] = new int[nums.length][];
        
        for(int i=0;i<nums.length;i++){
            arr[i]=new int []{nums[i],i};
        }
        
        Arrays.sort(arr,(a,b)->(a[0]-b[0]));
        
        int ans = 0;
        
        boolean vis[] = new boolean[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(vis[i]==true || arr[i][1]==i){
                continue;
            }
            
            int clen = 0;
            int j = i;
            
            while(vis[j]==false){
                vis[j]=true;
                clen++;
                j = arr[j][1];
            }
            ans+=clen-1;
            
            }

        return ans;
    }
}
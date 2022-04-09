// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.firstIndex(a, n));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public long firstIndex(long nums[], long n)
    {
        // Your code goes here
        
        int l = 0;
        int h = nums.length-1;
        int ans = -1;
        while(l <= h){
            int mid = l + (h-l)/2;
            
            if(nums[mid] == 1){
                ans = mid;
                h = mid-1;
            }
            else if(nums[mid] == 0){
                l = mid+1;
            }
            
        }
        
        return (long)ans;
    }
}
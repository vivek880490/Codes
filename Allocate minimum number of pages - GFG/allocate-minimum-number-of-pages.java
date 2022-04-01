// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]nums,int n,int k)
    {
        //Your code here
        
    int max = 0;
        int sum = 0;

        for(int x : nums){
            max = Math.max(max, x);
            sum += x;
        }

        int l = max;
        int h = sum;
        int res = -1;

        while(l <= h){
            int mid = l + (h-l)/2;

            if(possible(nums, k, mid) == true){
                res = mid;
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return res;
    }

    static boolean possible(int nums[], int k, int mid){
        int count = 1;
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];

            if(sum > mid){
                count++;
                sum = nums[i];
            }
        }

        return count <= k;
    }
}
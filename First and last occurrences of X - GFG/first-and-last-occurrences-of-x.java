// { Driver Code Starts
//Initial Template for Java

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
            String inputLine[] = br.readLine().trim().split(" "); 
            int n = Integer.parseInt(inputLine[0]); 
            int x = Integer.parseInt(inputLine[1]);
            
            int arr[] = new int[(int)(n)];
            
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine1[i]);
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.firstAndLast(arr, n, x); 
            
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    } 
} 
            


// } Driver Code Ends


//User function Template for Java
class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
        int ans[] = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int l = 0;
        int h = n-1;
        
        while(l <= h){
            int mid = l + (h-l)/2;
            
            if(arr[mid] == x){
                ans[0] = mid;
                h = mid-1;
            }
            else if(arr[mid] < x ){
                l = mid+1;
            }
            else if(arr[mid] > x){
                h = mid-1;
            }
        }
        
         l = 0;
         h = n-1;
        
        while(l <= h){
            int mid = l + (h-l)/2;
            
            if(arr[mid] == x){
                ans[1] = mid;
                l = mid+1;
            }
            else if(arr[mid] < x ){
                l = mid+1;
            }
            else if(arr[mid] > x){
                h = mid-1;
            }
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        
        if(ans[0] == -1 && ans[1] == -1) {
            al.add(-1);
            return al;
        }
        
        al.add(ans[0]);
        al.add(ans[1]);
        
        return al;
    }
}

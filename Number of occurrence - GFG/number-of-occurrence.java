// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int l = 0;
        int h = n-1;
        int ans[] = new int[2];
        ans[0] = -1;
        ans[1] = -1;
  
        
        while(l <= h){
            int mid = l +(h-l)/2;
            
            if(arr[mid] == x){
                ans[0] = mid;
                h = mid-1;
            }
            else if(arr[mid] < x){
                l = mid+1;
            }
            else if(arr[mid] > x){
                h = mid-1;
            }
        }
        
         l = 0;
         h = n-1;
        
        while(l <= h){
            int mid = l +(h-l)/2;
            
            if(arr[mid] == x){
                ans[1] = mid;
                l = mid+1;
            }
            else if(arr[mid] < x){
                l = mid+1;
            }
            else if(arr[mid] > x){
                h = mid-1;
            }
        }
        
         int res=0;
    if(ans[0]!=-1 && ans[1]!=-1)
    {
        res=ans[1]-ans[0]+1;
        return res;
    }
    return res;
    }
}
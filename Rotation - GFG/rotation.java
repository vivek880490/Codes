// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findKRotation(a, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int l = 0;
        int h = n-1;
        
        while(l <= h){
            if(arr[l] <= arr[h]) return l;
            
            int mid = l + (h-l)/2;
            
            int prev = (mid+n-1)%n;
            int next = (mid+1)%n;
            
            if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]){
                return mid;
            }
            
            else if(arr[l] <= arr[mid]){
                l = mid+1;
            }
            else if(arr[mid] <= arr[h] ){
                h = mid-1;
            }
        }
        return 0;
    }
}
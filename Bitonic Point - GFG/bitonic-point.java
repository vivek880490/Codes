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
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaximum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    int findMaximum(int[] nums, int n) {
        // code here
        if(nums.length == 1) return 0;
        int l=0;
        int h=nums.length-1;
        
        while(l <= h){
            int mid=l+(h-l)/2;
            if(mid > 0 && mid < nums.length-1){
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]){
                return nums[mid];
            }
                 else if(nums[mid] < nums[mid+1]){
                l=mid+1;
            }
            else if(nums[mid] < nums[mid-1]){
                h = mid-1;
            }
            }
            else if(mid == 0){
                if(nums[0] > nums[1]) return nums[0];
                else return nums[1];
            }
            else if(mid == nums.length-1){
                if(nums[nums.length-1] > nums[nums.length-2]) return nums[nums.length-1];
                else return nums[nums.length-2];
            }
           
        }
        return -1;
    }
}
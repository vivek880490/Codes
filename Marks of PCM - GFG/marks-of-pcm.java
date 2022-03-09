// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int phy[] = new int[n];
    		int chem[] = new int[n];
    		int math[] = new int[n];
            
            for (int i = 0; i < n; ++i)
                {
                    phy[i]=sc.nextInt();
                    chem[i]=sc.nextInt();
                    math[i]=sc.nextInt();
                }
		    
		    Solution ob = new Solution();
		    
		    ob.customSort (phy, chem, math, n);
    		for (int i = 0; i < n; ++i)
    			System.out.println(phy[i]+" " + chem[i] + " " + math[i]);

        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public void customSort (int phy[], int chem[], int math[], int n)
    {
        // your code here
        int arr[][] = new int [n][];
        
        for(int i=0; i<n; i++){
            arr[i] = new int[]{phy[i],chem[i],math[i]};
        }
        
        Arrays.sort(arr,(a,b)->{
            
            if(a[0]!=b[0]){
                return a[0]-b[0];
            }
            else if(a[1] != b[1]){
                return b[1]-a[1];
            }
            else{
                return a[2]-b[2];
            }
            
        });
        
        for(int i=0; i<n; i++){
            phy[i] = arr[i][0];
            chem[i] = arr[i][1];
            math[i] = arr[i][2];
        }
        
        
    }
}

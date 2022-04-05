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
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
   Map<Character, Integer> hm = new HashMap<>();
   int search(String pat, String txt) {
       int k = pat.length();
       int n = txt.length();
       int i=0, j=0, count=0, res=0;
       
       for (i=0; i<k; i++) {
           char ch = pat.charAt(i);
           hm.put(ch, hm.getOrDefault(ch,0)+1);
       }
       count = hm.size();
       i=0;
       while (j<n) {
           
           if (hm.containsKey(txt.charAt(j))) {
               hm.put(txt.charAt(j), hm.get(txt.charAt(j))-1);
              
               if ( hm.get(txt.charAt(j)) == 0) {
                   count--;
               }
           }
                       
           if (j-i+1 == k) {
              
               if (count == 0) {
                   res++;
               }
               
               if (hm.containsKey(txt.charAt(i))) {
                   if (hm.get(txt.charAt(i)) == 0) {
                       count++;
                   }
                   hm.put(txt.charAt(i), hm.get(txt.charAt(i))+1);
               }
               i++;
           }
           j++;
       }
       
       return res;
   }
}
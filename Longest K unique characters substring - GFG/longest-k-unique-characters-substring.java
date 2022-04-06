// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
         int n =s.length();
      HashMap<Character,Integer> map =new HashMap<>();
      int mLen = -1;
      int i = 0;
      int j = 0;
      while(j < n){
          char chj = s.charAt(j); 
          map.put(chj,map.getOrDefault(chj,0)+1);
          
          if( map.size() < k) j++;
          
          else if(map.size() == k){
              mLen = Math.max(mLen , j-i+1);
              j++;
          }
          else if(map.size() > k){
              while(map.size() > k){
                  char ch = s.charAt(i);
                  map.put(ch , map.get(ch) - 1);
                  if(map.get(ch) == 0) map.remove(ch);
                  i++;
              }
              j++;
          }
      }
      return mLen;
    }
}
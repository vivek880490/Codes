// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String s){
        // code here
        int n =s.length();
      HashMap<Character,Integer> map =new HashMap<>();
      int mLen = -1;
      int i = 0;
      int j = 0;
      while(j < n){
          char chj = s.charAt(j); 
          map.put(chj,map.getOrDefault(chj,0)+1);
          if( map.size() > j-i+1) j++;
          
          else if(map.size() == j-i+1){
              mLen = Math.max(mLen , j-i+1);
              j++;
          }
          else if(map.size() < j-i+1){
              while(map.size() < j-i+1){
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
// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}



// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long heights[], long N) 
    {
        // your code here
       int n = heights.length;
        
        int nsl[] = new int[n];
        
        int nsr[] = new int [n];
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<n; i++){
            if(st.size() == 0){
                nsl[i] = -1;
            }
            else if(st.size() > 0 && heights[st.peek()] < heights[i]){
                nsl[i] = st.peek();
            }
            else if(st.size() > 0 && heights[st.peek()] >= heights[i]){
                while(st.size() > 0 && heights[st.peek()] >= heights[i]){
                    st.pop();
                }
                if(st.size() == 0){
                    nsl[i] = -1;
                }
                else{
                    nsl[i] = st.peek();
                }
                
            }
            
            st.push(i);
        }
        
        st.clear();
        
                for(int i=n-1; i>=0; i--){
            if(st.size() == 0){
                nsr[i] = n;
            }
            else if(st.size() > 0 && heights[st.peek()] < heights[i]){
                nsr[i] = st.peek();
            }
            else if(st.size() > 0 && heights[st.peek()] >= heights[i]){
                while(st.size() > 0 && heights[st.peek()] >= heights[i]){
                    st.pop();
                }
                if(st.size() == 0){
                    nsr[i] = n;
                }
                else{
                    nsr[i] = st.peek();
                }
                
            }
            
            st.push(i);
        }
        
        
        
        long max = 0;
        
        for(int i=0; i<n; i++){
            
            //System.out.println(nsr[i] + " "+ nsl[i]);
            long width = (nsr[i] - nsl[i] - 1) * heights[i];
            max = Math.max(max, width);
        }
        
        return max;
        
    }
        
}




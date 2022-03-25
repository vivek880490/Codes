// { Driver Code Starts
import java.util.*;

class FindMinCost
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().maxArea(arr, n, m));
		t--;
		}
	}
}// } Driver Code Ends


/*Complete the function given below*/
class Solution {
    public int maxArea(int M[][], int n, int m) {
        
        int arr[] = new int[m];
        
        int max  = 0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(M[i][j] == 0){
                    arr[j] = 0;
                }
                else{
                    arr[j]+=1;
                }
            }
            
            int len = largestRectangleArea(arr);
            max = Math.max(len, max);
        }
        return max;
        
        
    }
    
    public int largestRectangleArea(int[] heights) {
        
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
        
        
        
        int max = 0;
        
        for(int i=0; i<n; i++){
            
            //System.out.println(nsr[i] + " "+ nsl[i]);
            int width = (nsr[i] - nsl[i] - 1) * heights[i];
            max = Math.max(max, width);
        }
        
        return max;
        
    }
}
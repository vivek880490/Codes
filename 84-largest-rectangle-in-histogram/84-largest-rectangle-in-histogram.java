class Solution {
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
            
            System.out.println(nsr[i] + " "+ nsl[i]);
            int width = (nsr[i] - nsl[i] - 1) * heights[i];
            max = Math.max(max, width);
        }
        
        return max;
        
    }
}
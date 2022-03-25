class Solution {
    public int maximalRectangle(char[][] matrix) {
        int arr[] = new int[matrix[0].length];
        int max = 0 ;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == '0'){
                    arr[j] = 0;
                }
                else{
                    arr[j]+=1;
                }
            }
            
            int len = mah(arr);
            max =  Math.max(max, len);
        }
        return max;
    }
    
    int mah(int arr[]){
        int n = arr.length;
        int nsl[] = new int[n];
        int nsr[] = new int[n];
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<n; i++){
            if(st.size() == 0){
                nsl[i] = -1;
            }
            else if(st.size() > 0 && arr[st.peek()] < arr[i]){
                nsl[i] = st.peek();
            }
            else if(st.size() > 0 && arr[st.peek()] >= arr[i]){
                while(st.size() > 0 && arr[st.peek()] >= arr[i]){
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
            else if(st.size() > 0 && arr[st.peek()] < arr[i]){
                nsr[i] = st.peek();
            }
            else if(st.size() > 0 && arr[st.peek()] >= arr[i]){
                while(st.size() > 0 && arr[st.peek()] >= arr[i]){
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
            int width = (nsr[i] - nsl[i] - 1) * arr[i];
            max = Math.max(max, width);
        }
        return max;
    }
}
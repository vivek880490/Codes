class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        
        int ans[] = new int[n];
            
        Stack<Integer> st = new Stack<>();
        
        for(int i=2*n-1; i>=0; i--){
            if(st.size() == 0){
                ans[i%n] = -1;
            }
            
            else if(st.size() > 0 && st.peek() > nums[i%n]){
                ans[i%n] = st.peek();
            }
            else if(st.size() > 0 && st.peek() <= nums[i%n]){
                while(st.size() > 0 && st.peek() <= nums[i%n]){
                    st.pop();
                }
                if(st.size() == 0){
                    ans[i%n] = -1; 
                }
                else{
                    ans[i%n] = st.peek();
                }
            }
            
            st.push(nums[i%n]);
        }
        
        return ans;
        
    }
}
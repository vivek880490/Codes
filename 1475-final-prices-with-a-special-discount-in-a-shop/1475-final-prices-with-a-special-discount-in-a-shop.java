class Solution {
    public int[] finalPrices(int[] nums) {
        int n = nums.length;
        
        int ans[] = new int[n];
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=n-1; i>=0; i--){
            
            if(st.size() == 0 ){
                ans[i] = nums[i];
            }
            else if(st.size() > 0 && st.peek() <= nums[i]){
                ans[i] = nums[i] - st.peek();
            }
            else if(st.size() > 0 && st.peek() > nums[i]){
                while(st.size() > 0 && st.peek() > nums[i]){
                    st.pop();
                }
                if(st.size() == 0){
                    ans[i] = nums[i];
                }
                else{
                    ans[i] = nums[i] - st.peek();
                }
            }
            
            st.push(nums[i]);
        }
        
        return ans;
        
    }
}
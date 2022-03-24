class Solution {
    public int[] dailyTemperatures(int[] nums) {
        
        int n = nums.length;
        
        int ans[] = new int[n];
        
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=nums.length-1; i>=0; i--){
            
            if(st.size() == 0){
                ans[i] = i;
            }
            else if(st.size() > 0  && nums[st.peek()] > nums[i]){
                ans[i] = st.peek();
            }
            else if(st.size() > 0 && nums[st.peek()] <= nums[i]){
                while(st.size() > 0 && nums[st.peek()] <= nums[i]){
                    st.pop();
                }
                if(st.size() == 0){
                    ans[i] = i;
                }
                else{
                ans[i] = st.peek();
                }
            }
            
            st.push(i);
                
        }
        //Collections.reverseOrder(al);
        int res[] = new int[ans.length];
        
        for(int i=0; i<ans.length; i++){
            res[i] = ans[i] - i;
        }
        
        return res;
    }
}
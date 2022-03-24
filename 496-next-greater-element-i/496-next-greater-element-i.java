class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=nums2.length-1; i>=0; i--){
            if(st.size() == 0){
                map.put(nums2[i], -1);
            }
            
            else if(st.size() > 0 && st.peek() > nums2[i]){
                map.put(nums2[i], st.peek());
            }
            else if(st.size() > 0 && st.peek() <= nums2[i]){
                
                while(st.size() > 0 && st.peek() <= nums2[i]){
                    st.pop();
                }
                
                if(st.size() == 0){
                    map.put(nums2[i], -1);
                }
                else{
                    map.put(nums2[i], st.peek());
                }
            }
            st.push(nums2[i]);
        }
        
        int ans[] = new int[nums1.length];
        int j = 0;
        for(int x : nums1){
            ans[j] = map.get(x);
            j++;
        }
        
        return ans;
        
    }
}
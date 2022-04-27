class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int ans[] = new int[nums.length];
        int i = 0;
       for(int x : nums){
           if(x%2 == 0){
               ans[i] = x;
               i += 2;
           }
       }
        
        int j = 1;
       for(int x : nums){
           if(x%2 == 1){
               ans[j] = x;
               j += 2;
           }
       }
        
        return ans;
        
    }
}
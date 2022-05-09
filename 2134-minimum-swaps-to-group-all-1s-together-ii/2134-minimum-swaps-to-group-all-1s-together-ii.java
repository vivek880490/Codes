class Solution {
    public int minSwaps(int[] nums) {
        
        int count  = 0;
        for(int x : nums){
            if(x == 1){
                count++;
            }
        }
        int ans = 0;
        int zerocount = 0;
        for(int i=0; i<count; i++){
           if(nums[i] == 0){
               zerocount++;
           } 
        }
        ans = zerocount;
        int n = nums.length;
        for(int i=count; i<2*n; i++){
            if(nums[i%n] == 0){
                zerocount++;
            }
            if(nums[(i-count)%n] == 0){
                zerocount--;
            }
            ans = Math.min(zerocount, ans);
        }
        
        return ans;
        
    }
}
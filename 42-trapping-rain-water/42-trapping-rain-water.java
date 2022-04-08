class Solution {
    public int trap(int[] nums) {
        int n = nums.length;
        int mxl[] = new int[n];
        int mxr[] = new int[n];
        
        mxl[0] = nums[0];
        mxr[n-1] = nums[n-1];
    
        for(int i=1; i<n; i++){
            mxl[i] = Math.max(nums[i],mxl[i-1]);
        }
        
        for(int i=n-2; i>=0; i--){
            mxr[i] = Math.max(nums[i],mxr[i+1]);
        }
        
        int bound[] = new int[n];
        
        for(int i=0; i<n; i++){
            bound[i] = Math.min(mxl[i], mxr[i]);
        }
        
        int height[] = new int[n];
        
        for(int i=0; i<n; i++){
            height[i] = bound[i] - nums[i];
        }
        
        int max = 0;
        
        for(int i=0; i<n; i++){
            max+=height[i];
        }
        
        return max;
    }
}
class Solution {
    public int splitArray(int[] nums, int m) {
        int max  = 0;
        int sum = 0;
        for(int x : nums){
            max = Math.max(x,max);
            sum += x;
        }
        
        
        int l = max;
        int h = sum;
        int ans = 0;
        if(m == nums.length) return max;
        
        
        
        while(l <= h){
            int mid = l + (h-l)/2;
            
            if(solve(nums, mid, m) == true){
                ans = mid;
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
    
    boolean solve(int nums[], int mid, int m){
        int sa = 1;
        int sum = 0;
        
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            
            if(sum > mid){
                sa++;
                sum = nums[i];
            }
        }
        
        return sa<=m;
    }
}
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int summin = nums[0];
        int min = nums[0];
        
        int summax = nums[0];
        int max = nums[0];
        
        int totalsum = nums[0];
        
        for(int i=1; i<nums.length; i++){
            totalsum += nums[i];
            
            summin = Math.min(nums[i], summin+nums[i]);
            min = Math.min(summin, min);
            
            
            summax = Math.max(nums[i], summax+nums[i]);
            max = Math.max(summax, max);
            
        }
        
        return totalsum == min ? max : Math.max(max, totalsum-min);
        
    }
}
class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = nums[0];
        
        int max = nums[0];
        
        for(int i=1; i<nums.length; i++){
            sum += nums[i];
            
            if(sum < nums[i]){
                sum = nums[i];
            }
            max = Math.max(max, sum);
        }
        
        return max;
        
    }
}
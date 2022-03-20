class Solution {
    public int maxProfit(int[] nums) {
        
        int bd = 0;
        int sd = 0;
        int profit = 0;
        
        for(int i=1; i<nums.length; i++){
            if(nums[i] >= nums[i-1]){
                bd++;
            }
            else{
                profit += nums[bd] - nums[sd];
                bd = sd = i;
            }
            
            
        }
        profit += nums[bd] - nums[sd];
        
        return profit;
        
        
    }
}
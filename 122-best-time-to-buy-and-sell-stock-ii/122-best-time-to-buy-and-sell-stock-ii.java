class Solution {
    public int maxProfit(int[] nums) {
        
        int bd = 0;
        int sd = 0;
        int profit = 0;
        
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]>=nums[i-1]){
                sd++;
            }
            else{
                profit+=nums[sd]-nums[bd];
                sd=bd=i;
            }
        }
         profit+=nums[sd]-nums[bd];
        return profit;
        
    }
}
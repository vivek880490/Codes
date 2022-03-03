class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        
        if(nums.length<3) return 0;
        int ans=0;
        
        int dp[]=new int[nums.length];
        
        for(int i=2;i<dp.length;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                dp[i]=dp[i-1]+1;
                ans+=dp[i];
            }
            else{
                dp[i]=0;
            }
        }
        return ans;
        
        
    }
}
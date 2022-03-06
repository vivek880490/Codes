class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        
        //Solution 1
        
        int sum = 0;
        for(int x:nums){
            sum+=x;
        }
       if(((sum - target) % 2 == 1) || (target > sum))
            return 0;
        
        int tar = (sum-target)/2;
        
        
        int dp[][] = new int[nums.length+1][tar+1];
        dp[0][0] = 1;
        
        for(int i=1;i<dp.length;i++){
            for(int j=0; j<dp[0].length; j++){
                if(nums[i-1]<=j){
                    dp[i][j] = dp[i-1][j-nums[i-1]]+dp[i-1][j];
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
                }
            }
        
        return dp[dp.length-1][tar];
    }
}
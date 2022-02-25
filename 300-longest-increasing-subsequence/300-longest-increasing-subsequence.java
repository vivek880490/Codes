class Solution {
    public int lengthOfLIS(int[] nums) {
        
        if(nums.length==1) return 1;
        int dp[]=new int[nums.length];
        dp[0]=1;
        
        int ans=0;
        
        for(int i=1;i<nums.length;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    max=Math.max(max,dp[j]);
                }
            }
            dp[i]=max+1;
            ans=Math.max(dp[i],ans);
        }
        return ans;
    }
}
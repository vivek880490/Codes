class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--){
            
            int steps=nums[i];
            int min=Integer.MAX_VALUE;
            
            for(int j=i+1;j<n && j<=i+steps;j++){
                min=Math.min(min,dp[j]);
            }
            
            if(min==Integer.MAX_VALUE){
                dp[i]=min;
            }
            else{
                dp[i]=min+1;
            }
        }
        return dp[0];
        
    }
}
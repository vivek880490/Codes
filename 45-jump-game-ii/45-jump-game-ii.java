class Solution {
    public int jump(int[] nums) {
       
       int n=nums.length;
        int dp[]=new int[n];
        // already on last index
       dp[n-1]=0;
        
        for(int i=n-2;i>=0;i--){
            int steps=nums[i];
            int min=Integer.MAX_VALUE;
            //last index se pahle tak, and jump should not be out of array
            for(int j=i+1;j<n && j<=i+steps;j++){
                min=Math.min(min,dp[j]);
            }
            //min is still same means there is no steps
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
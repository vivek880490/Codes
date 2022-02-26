class Solution {
    public boolean canPartition(int[] nums) {
        
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        if(sum%2==1) return false;
        int nsum=sum/2;
        
       boolean  dp[][]=new boolean[nums.length+1][nsum+1];
        
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 && j==0){
                    dp[i][j]=true;
                }
                else if(i==0){
                    dp[i][j]=false;
                }
                else if(j==0){
                    dp[i][j]=true;
                }
                else{
                    if(dp[i-1][j]==true){
                        dp[i][j]=true;
                    }
                    else{
                        int val=nums[i-1];
                        if(j>=val){
                            if(dp[i-1][j-val]==true){
                                dp[i][j]=true;
                            }
                        }
                    }
                    
                }
            }
        }
        return dp[nums.length][nsum];
        
    }
}
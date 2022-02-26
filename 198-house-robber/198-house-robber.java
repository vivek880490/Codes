class Solution {
    public int rob(int[] nums) {
        
        Integer qb[]=new Integer[nums.length];
        return solve(0,nums,qb);
        
    }
    
    int solve(int index,int nums[],Integer dp[]){
       
        if(index>=nums.length) return 0;
         if(dp[index]!=null) return dp[index];
        // lootenge tab next call next ka next elemet ke liye lagayenge
        int loot=nums[index]+solve(index+2,nums,dp);
        //skip karenge tab next elemnet se call lagayenge
        int skip=solve(index+1,nums,dp);
        
        dp[index]=Math.max(loot,skip);
        
        return dp[index];
    }
}
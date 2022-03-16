class Solution {
    
    public int rob(int[] nums) {
        int n = nums.length;
       Integer qb[] = new Integer[n+1];
        return solve(nums, 0, qb);
    }
    
    int solve(int nums[], int i,Integer qb[]){
        if(i >= nums.length) return 0;
        
        if(qb[i] != null) return qb[i];
        
        int loot = nums[i]+solve(nums,i+2,qb);
        int skip = solve(nums,i+1,qb);
        
        int temp = Math.max(loot,skip);
        
         //max = Math.max(temp,max);
        
        return qb[i]=temp;
    }
}
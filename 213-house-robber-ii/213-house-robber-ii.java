class Solution {
    public int rob(int[] nums) {
        
        if(nums.length==1) return nums[0];
        Integer qb[]=new Integer[nums.length+1];
        Integer qb1[]=new Integer[nums.length+1];
        int s1 = solve(nums,1,qb);
        int s2 = solve1(nums,0,qb1);
        
        return Math.max(s1,s2);

    }
    
    int solve(int nums[], int i,Integer qb[]){
        if(i>=nums.length) return 0;
        if(qb[i]!=null) return qb[i];
        
        int loot = nums[i]+solve(nums,i+2,qb);
        int skip = solve(nums,i+1,qb);
        
        return qb[i]=Math.max(loot,skip);
     }
    
     int solve1(int nums[], int i,Integer qb1[]){
        if(i>=nums.length-1) return 0;
        if(qb1[i]!=null) return qb1[i];
        
        int loot = nums[i]+solve1(nums,i+2,qb1);
        int skip = solve1(nums,i+1,qb1);
        
        return qb1[i] = Math.max(loot,skip);
     }
}
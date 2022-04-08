class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        Integer qb[] = new Integer[n+1];
        return solve(0, n, nums, qb);
    }
    
    int solve(int start, int end, int nums[], Integer qb[]){
        if(start >= end) return 0;
        if(qb[start] != null) return qb[start];
        int loot = nums[start] + solve(start+2, end, nums,qb);
        int skip = solve(start+1, end, nums,qb);
        
        return qb[start] = Math.max(loot, skip);
    }
}
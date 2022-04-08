class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        if(n == 1) return nums[0];
        Integer qb1[] = new Integer[n+1];
        Integer qb2[] = new Integer[n+1];
        int s1 = solve(0, n-1, nums, qb1);
        int s2 = solve(1, n, nums, qb2);
        return Math.max(s1,s2);
        
    }
    
    int solve(int start, int n, int nums[], Integer qb[]){
        
        if(start >= n) return 0;
        
        if(qb[start] != null) return qb[start];
        
        int loot = nums[start] + solve(start+2, n, nums, qb);
        int skip = solve(start+1,n, nums, qb);
        
        return qb[start] = Math.max(loot, skip);
    }
}
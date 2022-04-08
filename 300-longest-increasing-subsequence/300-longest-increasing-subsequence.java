class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length+1;
        
        Integer qb[][] = new Integer[n+1][n+1];
        
        return solve(0, -1, nums, qb);
    }
    
    int solve(int idx, int prev, int nums[], Integer qb[][]){
        if(idx == nums.length)  return 0;
        if(qb[idx][prev+1] != null) return qb[idx][prev+1];
        
        int count = solve(idx+1, prev, nums, qb);
        
        if(prev == -1 || nums[idx] > nums[prev]){
            count = Math.max(count,1 + solve(idx+1, idx, nums, qb));
        }
        
        return qb[idx][prev+1] = count;
    }
}
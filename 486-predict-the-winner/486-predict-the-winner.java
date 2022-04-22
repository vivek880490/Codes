class Solution {
    public boolean PredictTheWinner(int[] nums) {
        
        Integer qb[][] = new Integer[nums.length+1][nums.length+1];
        
        int ans = solve(nums, 0, nums.length-1, qb);
        
        int total = 0;
        for(int x : nums){
            total += x;
        }
        
        return ans >= total-ans;
    }
    
    int solve(int nums[], int i, int j, Integer qb[][]){
        if(i > j) return 0;
        
        if(i == j) return nums[i];
        
        if(qb[i][j] != null) return qb[i][j];
        
        int score = Math.max(
        nums[i] + Math.min(solve(nums, i+2, j, qb), solve(nums, i+1, j-1, qb)),
        nums[j] + Math.min(solve(nums, i, j-2, qb), solve(nums, i+1, j-1, qb))
        
        );
        
        return qb[i][j] = score;
    }
}
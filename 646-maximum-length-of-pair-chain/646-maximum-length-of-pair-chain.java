class Solution {
    public int findLongestChain(int[][] nums) {
        Arrays.sort(nums, (a,b)->(a[1]-b[1]));
        int n = nums.length;
        Integer qb[][] = new Integer[n+1][n+1];
        
        return solve(0, -1, nums, qb);
    }
    
    int solve(int idx, int prev, int nums[][], Integer qb[][]){
        if(idx == nums.length)  return 0;
        if(qb[idx][prev+1] != null) return qb[idx][prev+1];
        
        int count = solve(idx+1, prev, nums, qb);
        
        if(prev == -1 || nums[idx][0] > nums[prev][1]){
            count = Math.max(count,1 + solve(idx+1, idx, nums, qb));
        }
        
        return qb[idx][prev+1] = count;
    }
    
}
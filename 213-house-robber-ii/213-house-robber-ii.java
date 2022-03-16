class Solution {
    public int rob(int[] nums) {
        
        if(nums.length == 1) return nums[0];
        
        Integer qb1[] = new Integer[nums.length+1];
        Integer qb2[] = new Integer[nums.length+1];
        int n = nums.length;
        int s1 = solve1(nums, 0,n-1, qb1);
        int s2 = solve1(nums, 1,n, qb2);
        
        return Math.max(s1, s2);
    }
    
    int solve1(int nums[], int i,int n, Integer qb[]){
        if(i >= n) return 0;
        if(qb[i] != null) return qb[i];
        int rob = nums[i] + solve1(nums,i+2,n,qb);
        int skip = solve1(nums, i+1, n, qb);
        
        int temp = Math.max(rob, skip);
        
        return qb[i] = temp;
    }
    
    
}
class Solution {
    public int climbStairs(int n) {
        
        Integer qb[] = new Integer[n+1];
        
        return solve(n,qb);
    }
    
    int solve(int n, Integer qb[]){
        if(n == 0 || n == 1) return 1;
        
        if(qb[n] != null) return qb[n];
        
        int ans = solve(n-1,qb) + solve(n-2,qb);
        
        return qb[n]=ans;
    }
}
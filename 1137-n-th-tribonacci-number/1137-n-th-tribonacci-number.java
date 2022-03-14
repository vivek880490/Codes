class Solution {
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;
        
        Integer qb [] = new Integer[n+1];
        
        return solve(n, qb);
    }
    
    int solve(int n, Integer qb[]){
         if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;
        
        if(qb[n] != null) return qb[n];
        
        int sum = solve(n-3, qb) + solve(n-1, qb) + solve(n-2, qb);
        return qb[n]=sum;
    }
}
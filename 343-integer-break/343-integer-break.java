class Solution {
    
    public int integerBreak(int n) {
        
        Integer qb []  = new Integer [n+1];
        int max=Integer.MIN_VALUE;
        for(int i=1; i<n; i++){
            max=Math.max(max,i*helper(n-i,qb));
        }
        return max;
    }
    public int helper(int n,Integer qb[]){
        int max=Integer.MIN_VALUE;
        if(n==0){
            return 1;
        }
        if(qb[n]!=null){
            return qb[n];
        }
        for(int i=1; i<=n; i++){
            max=Math.max(max,i*helper(n-i,qb));
        }
        qb[n] = max;
        return max;
    }
}
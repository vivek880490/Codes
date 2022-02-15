class Solution {
    public int findJudge(int n, int[][] trust) {
        int dp[]=new int[n+1];
        
        for(int i=0;i<trust.length;i++){
            dp[trust[i][0]]--;
            dp[trust[i][1]]++;
            
        }
        
        for(int i=1;i<dp.length;i++){
            if(dp[i]==n-1) return i;
        }
        return -1;
    }
}
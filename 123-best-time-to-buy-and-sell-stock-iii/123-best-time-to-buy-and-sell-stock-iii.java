class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int qb[][][] = new int[n+1][2][3];
        
        for(int start = n-1; start>=0; start--){
            for(int buy=0; buy<=1; buy++){
                for(int allow=1; allow<=2; allow++){
                    
                    if(buy == 1){
                      qb[start][buy][allow] = Math.max(-prices[start] + qb[start+1][0] [allow],qb[start+1][1][allow]);   
                    }
                    else{
                      qb[start][buy][allow] = Math.max(prices[start] + qb[start+1][1] [allow-1],qb[start+1][0][allow]);     
                    }
                }
            }
        }
        
        return qb[0][1][2];
        
    }
}
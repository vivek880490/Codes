class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int cur[][] = new int[2][3];
        int after[][] = new int[2][3];
        
        for(int start = n-1; start>=0; start--){
            for(int buy=0; buy<=1; buy++){
                for(int allow=1; allow<=2; allow++){
                    
                    if(buy == 1){
                      cur[buy][allow] = Math.max(-prices[start] + after[0][allow],after[1][allow]);   
                    }
                    else{
                      cur[buy][allow] = Math.max(prices[start] + after[1] [allow-1],after[0][allow]);     
                    }
                }
            }
            
            after = cur;
        }
        
        return after[1][2];
        
    }
}
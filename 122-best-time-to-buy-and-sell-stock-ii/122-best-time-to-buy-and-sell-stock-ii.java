class Solution {
    public int maxProfit(int[] prices) {
        
        
        // agar buy ka option hai karenge to paisa lagega, -prices[i], aur buy kar liye to
        //next call aur buy ka option nahi rahega, 
        // ya naya buy nahi karenge profit = 0, buy ka option khul jayega
        
        
        // else sell karenge to paisa aayega +prices[i], aur sell kar diye to next buy ka option khul jayega, sell nahi karenge to profit 0 aur next buy ka option band rahega
        
        int n = prices.length;
        Integer qb[][] = new Integer[n+1][2];
        
        qb[n][0] = 0;
        qb[n][1] = 0;
        
        for(int start=n-1; start>=0; start--){
            for(int buy=0; buy<=1; buy++){
                int profit = 0;
        
       
        
        if(buy == 1){
            profit = Math.max(-prices[start] + qb[start+1][0], 0 + qb[start+1][1]);
        }
        else{
            profit = Math.max(prices[start] + qb[start+1][1], 0 + qb[start+1][0]);
        }
        
        qb[start][buy] = profit;
            }
        }
    
       return qb[0][1];
    }
}
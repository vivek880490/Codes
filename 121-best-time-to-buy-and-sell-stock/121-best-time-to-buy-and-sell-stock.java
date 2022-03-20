class Solution {
    public int maxProfit(int[] prices) {
        
        int tp = 0;
        int bd = prices[0];
        
        for(int i=0; i<prices.length; i++){
             bd = Math.min(prices[i], bd);
            int pist = prices[i] - bd;
            
            tp = Math.max(tp,pist);
        }
        
        return tp;
    }
}
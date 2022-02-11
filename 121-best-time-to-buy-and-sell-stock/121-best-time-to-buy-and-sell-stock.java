class Solution {
    public int maxProfit(int[] prices) {
        int pist=0;
        int tp=0;
        int buyingday=prices[0];
        
        int i=0;
        while(i<prices.length){
            buyingday=Math.min(buyingday,prices[i]);
            pist=prices[i]-buyingday;
            tp=Math.max(tp,pist);
            i++;
        }
        return tp;
        
    }
}
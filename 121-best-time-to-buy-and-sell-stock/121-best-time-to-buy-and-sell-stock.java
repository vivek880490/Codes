class Solution {
    public int maxProfit(int[] prices) {
        
        int pist=0;
        int tp=0;
        int bd=prices[0];
        
        for(int i=1;i<prices.length;i++){
            bd=Math.min(bd,prices[i]);
            
            pist=prices[i]-bd;
            tp=Math.max(tp,pist);
        }
        return tp;
    }
}
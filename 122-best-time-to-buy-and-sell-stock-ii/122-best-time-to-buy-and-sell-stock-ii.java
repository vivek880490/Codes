class Solution {
    public int maxProfit(int[] prices) {
        
        
        // agar buy ka option hai karenge to paisa lagega, -prices[i], aur buy kar liye to
        //next call aur buy ka option nahi rahega, 
        // ya naya buy nahi karenge profit = 0, buy ka option khul jayega
        
        
        // else sell karenge to paisa aayega +prices[i], aur sell kar diye to next buy ka option khul jayega, sell nahi karenge to profit 0 aur next buy ka option band rahega
        
        int n = prices.length;
        Integer qb[][] = new Integer[n][2];
        
        return solve(0, 1, n, prices, qb);
    }
    
    int solve(int start, int buy, int end, int prices[], Integer qb[][]){
        if(start == end) return 0;
        int profit = 0;
        
        if(qb[start][buy] != null) return qb[start][buy];
        
        if(buy == 1){
            profit = Math.max(-prices[start] + solve(start+1, 0, end, prices, qb), 0 + solve(start+1, 1, end, prices, qb));
        }
        else{
            profit = Math.max(prices[start] + solve(start+1, 1, end , prices, qb), 0 + solve(start+1, 0, end, prices, qb));
        }
        
        return qb[start][buy] = profit;
    }
}
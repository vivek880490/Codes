class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max = 0;
        for(int arr[]:accounts){
            int wealth = 0;
            for(int x:arr){
                wealth+=x;
            }
            max = Math.max(wealth,max);
        }
        
        return max;
    }
}
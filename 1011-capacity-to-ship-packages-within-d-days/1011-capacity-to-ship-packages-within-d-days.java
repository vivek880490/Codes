class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int sum = 0;
        int max  = 0;
        for(int x : weights){
            sum += x;
            max = Math.max(max,x);
        }
        
        int l = max;
        int h = sum;
        int res = 0;
        
        while(l <= h){
            int mid = l + (h-l)/2;
            
            if(possible(weights, days, mid) == true){
                res = mid;
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        
        return res;
        
    }
    boolean possible(int weights[], int days, int mid){
        
        int sum = 0;
        int count = 1;
        
        for(int i=0; i<weights.length; i++){
            sum += weights[i];
            
            if(sum > mid){
                count++;
                sum = weights[i];
            }
        }
        
        return count <= days;
    }
}
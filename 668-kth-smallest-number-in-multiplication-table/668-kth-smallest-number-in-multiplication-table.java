class Solution {
    public int findKthNumber(int m, int n, int k) {
        
        int l = 1;
        int h = m*n;
        
        while(l <= h){
            int mid = l + (h-l)/2;
            
            int c = solve(mid, m, n);
            
            if(c >= k){
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return l;
    }
    
    int solve(int mid, int m, int n){
        int count = 0 ;
        
        for(int i=1; i<=m; i++){
            count+= Math.min(mid/i, n);
        }
        return count;
    }
}
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
        // find karke kitna element mid se chota hai
        // for(int i=1; i<=m; i++){
            //count+= Math.min(mid/i, n);
        //}
         for (int i=1, j=n; i<=m; i++){
                while(j>=1 && i*j>mid) j--;
                count+=j;
            }
        return count;
    }
}
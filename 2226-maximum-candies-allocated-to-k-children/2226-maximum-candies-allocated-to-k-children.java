class Solution {
    public int maximumCandies(int[] quantities, long n) {
        
      int max = 0;
        int sum = 0;
        for(int x : quantities){
            max = Math.max(x,max);
            sum += x;
        }
        
        int l = 1;
        int h = 10000000;
        int res = 0;
        
        while(l <= h){
            
            int mid = l + (h-l)/2;
            
            if(possible(n,quantities,mid) == true){
                res = mid;
                l = mid + 1;
            }
            else{
                h = mid - 1;
            }
        }
        return res;
    }
    
    boolean possible(long n, int[] quantities, int mid){
        long count = 0;
        
        for(int i=0; i<quantities.length; i++){
                count += quantities[i]/ mid;
            
            
        }
        return count>=n;
        
    }
}
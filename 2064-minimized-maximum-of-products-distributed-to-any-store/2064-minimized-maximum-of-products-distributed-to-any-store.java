class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        
        int max = 0;
        int sum = 0;
        for(int x : quantities){
            max = Math.max(x,max);
            sum += x;
        }
        
        int l = 1;
        int h = max;
        int res = Integer.MAX_VALUE;
        
        while(l <= h){
            
            int mid = l + (h-l)/2;
            
            if(possible(n,quantities,mid) == true){
                res = Math.min(mid,res);
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return res;
    }
    
    boolean possible(int n, int[] quantities, int mid){
        int count = 0;
        
        for(int i=0; i<quantities.length; i++){
            if(quantities[i] <= mid){
                count++;
            }
            else{
                int temp = quantities[i];
                while(temp > 0){
                    temp-=mid;
                    count++;
                }
            }
            if(count > n ) return false;
        }
        return true;
        
    }
}
class Solution {
    public int maxDistance(int[] position, int m) {
        
        Arrays.sort(position);
        
        int len = position.length;
        
        int l = 1;
        int h = position[len-1]-position[0];
        
        int res = 0;
        
        while(l <= h){
            int mid = l + (h-l)/2;
            
            if(possible(position, m, mid) == true){
                res = mid;
                l = mid+1;
                
            }
            else{
                h = mid-1;
            }
        }
        return res;
    }
    
    boolean possible(int position[], int m, int mid){
        int prev = position[0];
        m--;
        for(int i=1; i<position.length; i++){
            if(position[i] -prev >= mid){
                m--;
                prev = position[i];
            }
        }
        if(m > 0) return false;
        return true;
    }
    
}
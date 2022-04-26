class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long sum = 0;
        for(int x : batteries){
            sum += x;
        }
        long l = 0, h = sum, ans=0;
        
        while(l <= h){
            long mid = l + (h-l)/2;
            
            if(possible(n, mid, batteries)){
                ans = mid;
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        
        return ans;
        
    }
    
    boolean possible(int n, long mid, int batteries[]){
        long duration = 0 ;
        for(int x : batteries){
            if(x < mid) duration += x;
            else duration += mid;
        }
        
        return duration >= mid*n;
    }
}
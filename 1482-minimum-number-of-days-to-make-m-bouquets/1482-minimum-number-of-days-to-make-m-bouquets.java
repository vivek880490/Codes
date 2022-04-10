class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        
        int l = Integer.MAX_VALUE;
        int h = 0;
        int ans = -1;
        for(int x : bloomDay){
            l = Math.min(l, x);
            h = Math.max(h, x);
        }
       
        while(l <= h){
            int mid = l + (h-l)/2;
            
            if(solve(bloomDay, mid, k, m) == true){
                ans = mid;
                h = mid-1;
            }
            else{
                l = mid+1;
            }
            
        }
        return ans;
    }
    
    boolean solve(int nums[], int mid, int k, int m){
        
        int boque = 0;
        int flower = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] <= mid){
                flower+=1;
                //max = Math.max(max, count);
            }
            else{
                flower = 0 ;
            }
            
            if(flower == k){
                boque++;
                flower = 0;
            }
        }
        
        
        return boque >= m;
    }
}
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int s = 0;
        int e = 0;
        int p = 1;
        int ans = 0;
        
        while(e < nums.length){
            p = p*nums[e];
            
            while( s < e && p >= k){
                p = p/nums[s];
                s = s+1;
            }
            if(p < k){
            int l = e-s+1;
            ans+=l;
            }
            e++;
            
        }
        return ans;
    }
}
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int s=0;
        int e=0;
        int p=1;
        int res=0;
        
        while(e<nums.length){
            p=p*nums[e];
            
            while(s<e && p>=k){
                p=p/nums[s];
                s+=1;
            }
            
            if(p<k){
                int len=e-s+1;
                res+=len;
            }
            e++;
        }
        return res;
        
    }
}
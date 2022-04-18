class Solution {
    public int findMiddleIndex(int[] nums) {
        
        // 2 5 4 12 16
        //        12   4
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        prefix[0] = nums[0];
        suffix[n-1] = nums[n-1];
        
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        
        
        for(int i=n-2; i>=0; i--){
            suffix[i] = suffix[i+1] + nums[i];
        }
        
        
        for(int i=0; i<n; i++){
            if(prefix[i] == suffix[i]){
                return i;
            }
        }
        return -1;
        
    }
}
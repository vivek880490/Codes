class Solution {
    public int getMaxLen(int[] nums) {
        
        int p = 0;
        int n = 0;
        int max = 0;
        for(int i=0; i<nums.length; i++){
           
            if(nums[i] == 0){
                p = 0;
                n = 0;
            }
            
            else if(nums[i] > 0){
                p++;
                
                if(n > 0) n++;
            }
            else{
                
                int temp = p;
                
                p = (n > 0 ? n+1 : 0);
                n = temp + 1;
            }
            
            max = Math.max(max, p);
        }
        
        return max;
        
    }
}
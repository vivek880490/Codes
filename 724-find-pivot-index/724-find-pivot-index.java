class Solution {
    public int pivotIndex(int[] nums) {
        
        int sum = 0;
        
        for(int i=0; i<nums.length; i++){
            
            sum+=nums[i];
        }
        
        int ls = 0;
        int rs = sum;
        
        for(int i=0; i<nums.length; i++){
            ls = ls + nums[i];
            
   
            if(ls == rs){
                return i;
            }
             
            rs = rs - nums[i];
        }
        return -1;
    }
}
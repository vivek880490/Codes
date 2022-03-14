class Solution {
    public boolean isMonotonic(int[] nums) {
        
        int inc = 0;
        int dec = 0;
        
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]) inc++; 
            else if(nums[i] < nums[i-1]) dec++;
            else {
                inc++;
                dec++;
            }
        }
        
        if(inc == nums.length-1 || dec == nums.length-1) return true;
        
        return false;
        
    }
}
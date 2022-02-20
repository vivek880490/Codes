class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int s=-1;
        
        int max=nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(max>nums[i]){
                s=i;
            }
            else{
                max=nums[i];
            }
        }
        
        int e=0;
        
        int min=nums[nums.length-1];
        
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>min){
                e=i;
            }
            else{
                min=nums[i];
            }
        }
        return s-e+1;
    }
}
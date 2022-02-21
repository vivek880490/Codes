class Solution {
    public int majorityElement(int[] nums) {
        //Arrays.sort(nums);
        int me=nums[0];
        
        int count=1;
        
        for(int i=1;i<nums.length;i++){
            
            if(count==0){
                 count++;
                me=nums[i];
               
            }
            else if(nums[i]==me){
                count++;
            }
            else{
                count--;
            }
        }
        return me;
    }
}
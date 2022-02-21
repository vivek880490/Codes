class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int me=nums[0];
        
        int count=1;
        
        for(int i=1;i<nums.length;i++){
            
            if(count==0){
                me=nums[i];
                count=1;
            }
            if(nums[i]==me){
                count++;
            }
            else{
                count--;
            }
        }
        return me;
    }
}
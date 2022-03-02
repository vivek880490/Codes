class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]==1){
               int l=i;
               int h=i;
               
               while(h<nums.length){
                   if(nums[h]==1){
                       h++;
                   }
                   else{
                       break;
                   }
               }
               
               int len = h-l;
               max = Math.max(max,len);
           }
       }
        return max;
    }
}
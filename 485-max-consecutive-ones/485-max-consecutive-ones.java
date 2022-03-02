class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max = nums[0];
        int sum = nums[0];
        
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]==0){
                sum=0;
            }
            max=Math.max(sum,max);
        }
        return max;
    }
}
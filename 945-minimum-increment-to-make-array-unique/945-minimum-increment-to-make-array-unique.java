class Solution {
    public int minIncrementForUnique(int[] nums) {
      
        Arrays.sort(nums);
        int count = 0;
        int pre = nums[0];
        for(int i=1; i<nums.length; i++){
            pre = Math.max(pre+1, nums[i]);
            count += pre - nums[i];
        }
        
        return count;
        
     // 1 1 2 2 3 7
    //  1 2 2 2 3 7
     // 1 2 3 2 3 7
    }
}
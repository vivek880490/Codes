class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(i!=j){
                    int temp = Math.abs(nums[i] - nums[j]);
                    if(temp == k){
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}
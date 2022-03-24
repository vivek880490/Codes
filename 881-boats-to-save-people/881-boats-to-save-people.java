class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        
        Arrays.sort(nums);
        
        int l = 0;
        int r = nums.length-1;
        
        int count = 0;
        
        while(l <= r){
            
            int sum = nums[l] + nums[r];
            
            if(sum <= limit){
                count++;
                l++;
                r--;
            }
            else{
                count++;
                r--;
            }
        }
        
        return count;
    }
}
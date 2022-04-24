class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];
        int l = 0;
        int h = nums.length-1;
        
        while(l <= h){
            int mid = l + (h-l)/2;
            
            if(mid > 0 && mid < nums.length-1){
                if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                    return nums[mid];
                }
                else if((nums[mid]==nums[mid+1] && mid%2==1) || (nums[mid]==nums[mid-1] && (mid-1)%2==1))
                h = mid-1;
            else
                l = mid+1;
            }
            else if(mid == 0){
                if(nums[mid] == nums[mid+1] == false){
                    return nums[0];
                }
            }
            else if(mid == nums.length-1){
                if(nums[mid] == nums[mid-1] == false){
                    return nums[nums.length-1];
                }
            }
            
            
            
        }
        return -1;
            
    }
}
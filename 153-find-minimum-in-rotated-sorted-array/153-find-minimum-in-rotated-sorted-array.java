class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l=0;
        int h=nums.length-1;
        
        while(l <= h){
            if(nums[l] <= nums[h]) return nums[l];
            int mid = l+(h-l)/2;
            int prev = (mid+n-1)%n;
            int next = (mid+1)%n;
            if(nums[prev] >= nums[mid] && nums[mid] <= nums[h]){
                return nums[mid];
            }
            else if(nums[l] <= nums[mid]){
                l = mid+1;
            }
            else if(nums[mid] <= nums[h]){
                h = mid-1;
            }
        }
        return -1;
    }
}
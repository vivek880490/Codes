class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int l = 0;
        int h = 0;
        int n = nums.length;
        int count = 0;
        int ans = 0;
        while(h < n){
            if(left <= nums[h] && nums[h] <= right){
                count = h-l+1;
                ans+=count;
            }
            else if(nums[h] < left){
                ans+=count;
            }
            else{
                l = h+1;
                count = 0;
            
            }
            h++;
        }
        
        return ans;
    }
}
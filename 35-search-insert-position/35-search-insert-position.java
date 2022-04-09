class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int n=nums.length;
        
        int l=0;
        int h=n-1;
        
        while(l<=h){
            int mid = l+(h-l)/2;
            
            if(target==nums[mid]){
                return mid;
            }
            
            else if(target < nums[mid]){
                h=mid-1;
            }
            else if(target>nums[mid]){
                l=mid+1;
        }
        }
        return l;
        
    }
}
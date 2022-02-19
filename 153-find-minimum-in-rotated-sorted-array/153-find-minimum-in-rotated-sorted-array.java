class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        
        //check if nums is completely sorted
        //then just return the first element
        
        if(nums[0]<=nums[n-1]) return nums[0];
        
        //let's apply binary search
        
        int l=0;
        int h=n-1;
        
        while(l<=h){
            int mid = (l+h)/2;
            
            // first half is sorted and this the largest element of the first half so next elemrnt will be smallest
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            //first half is sorted and this is the first element of the second half and is smallest
            else if(nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            else{
                //if rigth half is sorted neglect this half
                if(nums[l]<=nums[mid]){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
            
        }
        return -1;
        
    }
}
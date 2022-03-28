class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        
        //if(n == 1 && nums[0]==target) return 0;
        
        int index = indexofminelemnt(nums);
        int s1 = -1;
        int s2 = -1;
        
        if(target <= nums[n-1]){
         s2 = binarysearch(nums, index, n-1, target);
        }
        else
        {
         s1 = binarysearch(nums,0,index-1,target);
        }
        
        
        return s1==-1?s2:s1;
       
        
    }
    
    int indexofminelemnt(int nums[]){
        int n = nums.length;
        int l = 0;
        int h = n-1;
        
        while(l <= h){
            if(nums[l] < nums[h]) return l;
            
            int mid = l + (h-l)/2;
            
            int left = (mid+n-1) % n;
            int right = (mid+1) % n;
            
            if(nums[left] >= nums[mid] && nums[right] >= nums[mid]){
                return mid;   
            }
            
            else if(nums[l] <= nums[mid]){
                l = mid+1;
            }
            else if(nums[h] >= nums[mid]){
                h = mid - 1;
            }
        }
        
        return 0;
    }
    
    int binarysearch(int nums[],int l, int h, int x){
        
        while(l <= h){
        int mid = l +(h-l)/2;
        if(nums[mid] == x) return mid;
        if(nums[mid] < x) l = mid+1;
        else if(nums[mid] > x) h = mid-1;
        }
        return -1;
        
    }
}
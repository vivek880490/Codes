class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int x[] : grid){
            count+=solve(x);
        }
        return count;
      
    }
    
    int solve(int nums[]){
        int l = 0;
        int h = nums.length-1;
        int count = 0;
             if (nums[h] >= 0) return 0;
            if(nums[l] < 0) return nums.length;
        while(l <= h){

            int mid = l + (h-l)/2;
            
            if(nums[mid] >= 0){
                l = mid + 1;
            }
            
            else if(nums[mid] < 0){
                count += h-mid+1;
                h =mid-1;
            }
        }
        
        return count;
    }
}

// 4 3 2 -1
// 3 2 1 -1
// 1 1 -1 -2
// -1 -1 -2 -3    
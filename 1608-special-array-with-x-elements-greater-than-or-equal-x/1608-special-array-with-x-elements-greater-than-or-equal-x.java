class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        int l = 0;
        int h = n;
        
        while(l <= h){
            
            int mid = l + (h-l)/2;
            
            if(solve(mid, nums) == mid) return mid;
            
            else if(solve(mid, nums) < mid) h = mid-1;
            else if(solve(mid, nums) > mid) l = mid+1;
            
            
            
        }
        return -1;
    }
    
    int solve(int mid, int nums[]){
        int count = 0;
        for(int x : nums){
            if(x >= mid) count++;
        }
        return count;
    }
}
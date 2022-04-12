class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int zero = 0;
        for(int x : arr){
            if(x == 0) zero++;
            else if(x!=0 && (solve(x,arr) && solve(2*x,arr))){
                return true;
            }
        }
        
        return zero >= 2;
    }
    
    boolean solve(int x, int nums[]){
        int l = 0;
        int h = nums.length-1;
        
        while(l <= h){
            int mid = l + (h-l)/2;
            
            if(nums[mid] == x) return true;
            else if(nums[mid] < x) l = mid+1;
            else if(nums[mid] > x) h = mid-1;
        }
        
        return false;
    }
}
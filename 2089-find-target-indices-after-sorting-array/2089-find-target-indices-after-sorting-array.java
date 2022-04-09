class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        List<Integer> ans = new ArrayList<>();
        
        int l = 0;
        int h = nums.length-1;
        int lb = -1;
        int ub = -1;
        
        while(l <= h){
            int mid = l + (h-l)/2;
            
            if(nums[mid] == target){
                lb = mid;
                h = mid-1;
            }
            else if(nums[mid] > target){
                h = mid-1;
            }
            else if(nums[mid] < target){
                l = mid+1;
            }
        }
        l = 0;
         h = nums.length-1;
        
        while(l <= h){
            int mid = l + (h-l)/2;
            
            if(nums[mid] == target){
                ub = mid;
                l = mid+1;
            }
            else if(nums[mid] > target){
                h = mid-1;
            }
            else if(nums[mid] < target){
                l = mid+1;
            }
        }
        
        if(ub == -1 || lb == -1) return new ArrayList<>();
        
        for(int i=lb; i<=ub; i++){
            ans.add(i);
        }
        
        return ans;
        
        
        
    }
}
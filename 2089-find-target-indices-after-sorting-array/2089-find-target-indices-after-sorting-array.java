class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                ans.add(i);
            }
        }
        
        
//         int n = nums.length;
        
//         int l = 0;
//         int h = n-1;
        
//         while(l <= h){
//             int mid = l + (h-l)/2;
            
//             if(nums[mid] == target) {
//                 ans.add(mid);
//                 l = mid+1;
//             }
//             else if(nums[mid] >  target){
//                 l = mid + 1;
//             }
//             else if(nums[mid] < target){
//                 h = mid-1;
//             }
            
//         }
        
//          l = 0;
//          h = n-1;
        
//         while(l <= h){
//             int mid = l + (h-l)/2;
            
//             if(nums[mid] == target) {
//                 ans.add(mid);
//                 h = mid-1;
//             }
//             else if(nums[mid] >  target){
//                 l = mid + 1;
//             }
//             else if(nums[mid] < target){
//                 h = mid-1;
//             }
            
//         }
        return ans;
        
    }
}
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        int diff = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            int j = i+1;
            int k = n-1;
            
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(Math.abs(diff) > Math.abs(sum-target)){
                    diff = sum - target;
                    ans = sum;
                }
                if(sum < target)
                    j++;
                
                else k--;  
            }
        }
        
        return ans;
        
    }
}
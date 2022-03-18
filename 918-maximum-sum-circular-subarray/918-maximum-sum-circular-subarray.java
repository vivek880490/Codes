class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int s1 = solve(nums);
        int sum  = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            nums[i] = nums[i] * (-1);
        }
        
        int s2 = solve(nums);
        if(s2 + sum == 0) return s1;
        return Math.max(s1, s2+sum);
        
        
        
        
    }
    
    int solve(int arr[]){
        int sum =  arr[0];
        int max = arr[0];
        
        for(int i=1; i<arr.length; i++){
            sum += arr[i];
            
            if(sum < arr[i]){
                sum = arr[i];
            }
            max = Math.max(sum, max);
        }
        
        return max;
    }
}
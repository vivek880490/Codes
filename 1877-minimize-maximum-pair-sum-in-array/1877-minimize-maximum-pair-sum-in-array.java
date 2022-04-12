class Solution {
    public int minPairSum(int[] nums) {
        
        // 2 3 3 5
        // 2 3 4 4 5 6
        
        Arrays.sort(nums);
        
        int i = 0;
        int j = nums.length-1;
        int max = 0;
        while(i < j){
            int sum = nums[i] + nums[j];
            max = Math.max(max, sum);
            i++;
            j--;
        }
        
        return max;
    }
}
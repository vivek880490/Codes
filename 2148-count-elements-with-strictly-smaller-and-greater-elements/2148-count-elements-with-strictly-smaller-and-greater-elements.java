class Solution {
    public int countElements(int[] nums) {
        
        Arrays.sort(nums);
        
        // 2 7 11 15
        
        int count = 0;
        
        for(int i=1; i<nums.length-1; i++){
            if(nums[i] != nums[0] && nums[i] != nums[nums.length-1]){
                count++;
            }
        }
        
        return count;
    }
    
    
    
}
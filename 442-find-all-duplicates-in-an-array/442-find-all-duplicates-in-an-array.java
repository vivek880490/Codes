class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> ans = new ArrayList<>();
        
        int j = 0;
        while(j < nums.length){
            if(nums[j] != nums[nums[j]-1]){
                swap(nums,j,nums[j]-1);
            }
            else{
                j++;
            }
        }
        
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1){
               ans.add(nums[i]); 
            }
        }
        
        return ans;
        
    }
    
    void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
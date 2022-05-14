class Solution {
    public int[] findErrorNums(int[] nums) {
        //Arrays.sort(nums);
        
        int ans[] = new int[2];
        
        int i = 0;
        while(i < nums.length){
            if(nums[i] != nums[nums[i]-1]){
                swap(i, nums[i]-1,nums);
            }
            else{
                i++;
            }
        }
        
       for(int l=0; l<nums.length; l++){
           if(nums[l] != l+1){
               ans[0] = nums[l];
               ans[1] = l+1;
           }
       }
        return ans;
    }
     void swap(int j, int k, int nums[]){
        int temp = nums[j];
        nums[j] = nums[k];
        nums[k] = temp;
    }
   
}
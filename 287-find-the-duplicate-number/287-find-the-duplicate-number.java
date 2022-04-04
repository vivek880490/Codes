class Solution {
    public int findDuplicate(int[] nums) {
      int i=0;
    while(i<nums.length){
        if(nums[i]!=nums[nums[i]-1]){ 
            swap(nums, i, nums[i]-1);
            
        }
        else {
            i++;
        }
    }
    
    int j;   
    for(j=0;j<nums.length;j++){
        if(nums[j]!=j+1)
         return nums[j];
    }
    return -1;

    }
    
    void swap(int nums[], int x, int y){
        int temp = nums[x];
            nums[x] =nums[y];
            nums[y] = temp;
    }
}
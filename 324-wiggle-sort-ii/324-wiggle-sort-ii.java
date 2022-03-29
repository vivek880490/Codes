class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans[] = new int[n];
        int i = 1;
        int j = n-1;
        
        while(i < n){
            ans[i] = nums[j];
            i+=2;
            j--;
            
        }
        i = 0;
        while(i < n){
            ans[i] = nums[j];
            i+=2;
            j--;
        }
        
        for(int k=0; k<n; k++){
            nums[k] = ans[k];
        }
        
    }
}
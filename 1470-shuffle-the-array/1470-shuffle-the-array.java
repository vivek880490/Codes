class Solution {
    public int[] shuffle(int[] nums, int n) {
    
        int ans[] = new int[2*n];
        int i = 0;
        int j = n;
        int k = 0;
        while(k < 2*n){
            if(k%2 == 0){
                ans[k] = nums[i];
                k++;
                i++;
            }
            else if(k%2 == 1){
                ans[k] = nums[j];
                k++;
                j++;
            }
          
        }
        
        return ans;
    }
}
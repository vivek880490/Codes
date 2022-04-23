class Solution {
    public int minimumDeletions(int[] nums) {
        
        int l = 0;
        int h = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i < nums.length; i++){
            
            if(nums[i] < min){
                min = nums[i];
                l = i;
            }
            
            if(nums[i] > max){
                max = nums[i];
                h = i;
            }
        }
        
            int x = l;
        if(l > h){
            l = h;
            h = x;
        } 
        int n = nums.length;
        int op1 = h+1;
        int op2 = (l+1) + (n-h);
        int op3 = n-l;
        int ans = Math.min(op1,Math.min(op2,op3));
        return ans;
        
            
    }
}
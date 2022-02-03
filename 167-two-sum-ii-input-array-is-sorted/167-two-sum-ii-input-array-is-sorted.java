class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int ans[]=new int[2];
        
        int l=0;
        int h=nums.length-1;
        
        while(l<h){
            int sum=nums[l]+nums[h];
            
            if(sum>target){
                h--;
            }
            else if(sum<target){
                l++;
            }
            else{
                ans[0]=l+1;
                ans[1]=h+1;
                break;
            }
        }
        return ans;
        
    }
}
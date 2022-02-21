class Solution {
    public int maxArea(int[] nums) {
        
        int l=0;
        int h=nums.length-1;
        
        int max=0;
        
        while(l<h){
            int height=Math.min(nums[l],nums[h]);
            int area=height*(h-l);
            
            max=Math.max(area,max);
            
            if(nums[l]<nums[h]) l++;
            else h--;
        }
        return max;
    }
}
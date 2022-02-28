class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String>ans=new ArrayList<>();
        int i=0;
        int j=0;
        
        while(i<nums.length){
            j=i;
            
            while(j+1<nums.length && nums[j+1]==nums[j]+1){
                j++;
            }
            
            if(i==j){
                String s=String.valueOf(nums[i]);
                ans.add(s);
                i++;
            }
            else{
                ans.add(nums[i]+"->"+nums[j]);
                i=j+1;
            }
        }
            
        return ans;
            
        }
    
}
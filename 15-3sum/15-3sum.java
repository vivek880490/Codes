class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                
                int l=i+1;
                int h=nums.length-1;
                
                int target=0-nums[i];
                
                while(l<h){
                    
                    if(nums[l]+nums[h]==target){
                        ArrayList<Integer>temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[l]);
                        temp.add(nums[h]);
                        
                        ans.add(temp);
                    
                    
                    while(l<h && nums[l]==nums[l+1]) l++;
                    while(l<h && nums[h]==nums[h-1]) h--;
                    
                    l++;
                    h--;
                
                    }
                else if(nums[l]+nums[h]>target) h--;
                else l++;
                } 
            }
        }
        return ans;
        
    }
}
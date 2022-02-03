class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>>al=new ArrayList<>();
        
        int n=nums.length;
        
        Arrays.sort(nums);
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                
                int target2=target-nums[i]-nums[j];
                
                int l=j+1;
                int h=n-1;
                
                while(l<h){
                    
                    int sum=nums[l]+nums[h];
                    if(sum<target2) l++;
                    else if(sum>target2) h--;
                    else{
                        
                        List<Integer>temp=new ArrayList<>();
                        
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[l]);
                        temp.add(nums[h]);
                         al.add(temp);
                        
                        
                        while(l<h && nums[l]==temp.get(2)) l++;
                        
                        while(l<h && nums[h]==temp.get(3)) h--;
                        
                    }
                }
                
                while(j+1<n && nums[j+1]==nums[j]) j++;
                while(i+1<n && nums[i+1]==nums[i]) i++;
                
            }
        }
        return al;
        
    }
}
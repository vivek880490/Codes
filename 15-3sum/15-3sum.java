class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        
        Arrays.sort(nums);
        List<List<Integer>>al=new ArrayList<>();
        
        for(int i=0;i<n-2;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                int l=i+1;
                int h=n-1;
                int sum=0-nums[i];
                
                while(l<h){
                    if(nums[l]+nums[h]==sum){
                        ArrayList<Integer>temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[l]);
                        temp.add(nums[h]);
                        al.add(temp);
                        
                        
                        while(l<h && nums[l]==nums[l+1])l++;
                        while(l<h && nums[h]==nums[h-1])h--;
                        l++;
                        h--;
                    }
                    else if(nums[l]+nums[h]>sum) h--;
                    else l++;
                }
            }
        }
        return al;
        
    }
}
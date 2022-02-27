class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<List<Integer>>();
        ArrayList<Integer>temp=new ArrayList<>();
        solve(0,ans,temp,nums);
        return ans;
        
        
        
        
    }
    static void solve(int p,List<List<Integer>>ans,ArrayList<Integer>temp,int nums[]){
        
        if(p<=nums.length){
            ans.add(new ArrayList<Integer>(temp));
        }
        
        for(int i=p;i<nums.length;i++){
            if(i>p && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            solve(i+1,ans,temp,nums);
            temp.remove(temp.size()-1);
            
        }
    }
        
    
    
    
}
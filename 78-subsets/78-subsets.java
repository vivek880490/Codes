class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>al=new ArrayList<>();
        
        
        solve(nums,0,ans,al);
        return ans;
        
    }
    void solve(int nums[],int i,List<List<Integer>> ans,List<Integer>al){
        if(i>=nums.length){
            ans.add(new ArrayList<Integer>(al));
            return;
        }
        
        al.add(nums[i]);
        solve(nums,i+1,ans,al);
        
        al.remove(al.size()-1);
        solve(nums,i+1,ans,al);
    }
}
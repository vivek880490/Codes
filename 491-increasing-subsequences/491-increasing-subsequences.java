public class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        solve(new ArrayList<Integer>(), 0, nums, res);
        return res; 
    }
    private void solve(List<Integer> list, int index, int[] nums, List<List<Integer>> res){
        if(list.size()>1) res.add(new ArrayList<Integer>(list));
        
        Set<Integer> used = new HashSet<>();
        
        for(int i = index; i<nums.length; i++){
            if(used.contains(nums[i])) continue;
            if(list.size()==0 || nums[i]>=list.get(list.size()-1)){
                used.add(nums[i]);
                list.add(nums[i]); 
                solve(list, i+1, nums, res);
                list.remove(list.size()-1);
            }
        }
    }
}
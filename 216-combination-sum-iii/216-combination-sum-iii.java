class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        solve(1,k,n,new ArrayList(),ans);
        return ans;
    }
    
    void solve(int start, int k, int n, List<Integer>al,List<List<Integer>> ans){
        if(k < 0 || n < 0) return;
        
        if(k == 0 && n == 0){
            ans.add(new ArrayList<>(al));
            return;
        }
        
        
        for(int i=start; i<=9; i++){
            al.add(i);
            solve(i+1,k-1,n-i,al,ans);
            al.remove(al.size()-1);
        }
    }
}
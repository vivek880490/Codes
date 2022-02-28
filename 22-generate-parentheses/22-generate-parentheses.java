class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String>ans=new ArrayList<>();
        
        solve(ans,n,"",0,0);
        return ans;
    }
    
    void solve(List<String>ans,int n,String res,int open,int close){
        if(res.length()==2*n){
            ans.add(res);
            return;
        }
        
        if(open<n)
            solve(ans,n,res+"(",open+1,close);
        
        if(close<open)
            solve(ans,n,res+")",open,close+1);
        
        
    }
}
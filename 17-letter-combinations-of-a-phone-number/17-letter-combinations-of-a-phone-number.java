class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String>ans=new ArrayList<>();
        
        if(digits==null || digits.length()==0) return ans;
        
         char[][] map = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
        
        solve(digits,map,0,new StringBuilder(),ans);
        return ans;
        
    }
    void solve(String digits,char map[][],int start,StringBuilder sb,List<String>ans){
        if(start==digits.length()){
            ans.add(new String(sb));
            return;
        }
        int num = digits.charAt(start)-'0';
        
        for(int i=0;i<map[num].length;i++){
            sb.append(map[num][i]);
            solve(digits,map,start+1,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
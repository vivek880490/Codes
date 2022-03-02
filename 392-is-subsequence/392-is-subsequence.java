class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) return true;
        if((s==null) && t == null) return true;
        if(s==null || t == null) return false;
        return solve(0,0,s,t);
        
    }
    
    boolean solve(int i,int j,String s,String t){
        if(i==s.length()) return true;
        
        if(i==s.length() || j==t.length()) return false;
        
        if(s.charAt(i)==t.charAt(j))
            return  solve(i+1,j+1,s,t);
        
        else
            return solve(i,j+1,s,t);
        
    
    }
}
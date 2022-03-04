class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        
        
        
        if(s1.equals(s2)) return true;
        
        int count = 0;
        for(int i=0;i<s1.length();i++){
            char s = s1.charAt(i);
            char t = s2.charAt(i);
            
            if(s!=t) count++;
        }
        
        return count==2 && solve(s1,s2);
    }
    
    boolean solve(String s1 , String s2){
        
        int ch [] = new int [26];
        
        for(int i=0;i<s1.length();i++){
            char s = s1.charAt(i);
            char t = s2.charAt(i);
            
            ch[s-'a']++;
            ch[t-'a']--;
        }
        
        for(int i=0;i<ch.length;i++){
            if(ch[i]!=0) return false;
        }
        return true;
    }
}
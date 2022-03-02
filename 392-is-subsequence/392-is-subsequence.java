class Solution {
    public boolean isSubsequence(String s, String t) {
    
        
        if(s.length()>t.length()) return false;
        
        int i=0;
        int j=0;
        StringBuilder sb=new StringBuilder();
        while(i<s.length() && j<t.length()){
            
            if(s.charAt(i)==(t.charAt(j))){
                sb.append(s.charAt(i));
                i++;
                j++;
                
            }
            else{
                j++;
            }
        }
        System.out.println(i+" "+j+" "+sb.toString());
        if(i==s.length()) return true;
        return false;
    }
}
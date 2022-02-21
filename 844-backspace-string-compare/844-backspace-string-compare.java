class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='#' & sb.length()>0){
                sb.deleteCharAt(sb.length() - 1);
            }
            else if(ch=='#'){
                continue;
            }
            else
            {
                sb.append(ch);
            }
        }
        
        
        
        StringBuilder tb=new StringBuilder();
        
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            if(ch=='#' & tb.length()>0){
                tb.deleteCharAt(tb.length() - 1);
            }
            else if(ch=='#'){
                continue;
            }
            else
            {
                tb.append(ch);
         
            }
        }
        
        return (sb.toString().equals(tb.toString()));
        
    }
}
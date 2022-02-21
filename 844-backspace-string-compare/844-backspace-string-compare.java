class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character>st=new Stack<>();
     
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#' && st.size()>0){
                st.pop();
            }
            else if(ch=='#'){
            continue;
            }
            else{
            st.push(ch);
            }
        }
            StringBuilder sb=new StringBuilder();
            
            while(st.size()>0){
                sb.append(st.pop());
            }
            
            
             for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(ch=='#' && st.size()>0){
                st.pop();
            }
            else if(ch=='#'){
            continue;
            }
                 else{
            st.push(ch);
            }
             }
            StringBuilder tb=new StringBuilder();
            
            while(st.size()>0){
                tb.append(st.pop());
            }
                  
        System.out.println(sb.toString() +" "+ tb.toString());
        
             return (sb.toString().equals(tb.toString())); 
    }
}
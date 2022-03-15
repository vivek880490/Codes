class Solution {
    public String minRemoveToMakeValid(String s) {
        
        
        char ch [] = s.toCharArray();
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(c == '('){
                st.push(i);
            }
            else if(c == ')'){
                if(st.size() > 0){
                    st.pop();
                }
                else{
                    ch[i] = '.';
                }
            }
        }
        
        while(st.size() > 0){
            ch[st.pop()] = '.';
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(char x:ch){
            if(x!='.'){
            sb.append(x);
            }
        }
        
        return sb.toString();
    }
}
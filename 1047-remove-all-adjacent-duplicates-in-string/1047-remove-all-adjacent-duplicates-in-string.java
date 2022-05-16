class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(st.size() == 0 || st.peek() != ch){
                st.push(ch);
            }
            else{
                if(st.peek() == ch){
                    st.pop();
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(st.size() > 0){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
        
    }
}
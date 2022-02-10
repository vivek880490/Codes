class Solution {
    public String minRemoveToMakeValid(String s) {
        char [] ch=s.toCharArray();
        Stack<Integer>st=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(i);
            }
            if(c==')'){
                if(st.size()==0){
                    ch[i]='.';
                }
                else{
                    st.pop();
                }
            }
        }
        while(st.size()>0){
            ch[st.pop()]='.';
        }
        StringBuilder sb=new StringBuilder();
        //String ans="";
        for(char c : ch){
            if(c!='.'){
                sb.append(c);
                //ans+=c;
            }
        }
        return sb.toString();
        //return ans;
    }
}
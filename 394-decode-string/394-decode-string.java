class Solution {
    public String decodeString(String s) {
        
        Stack<StringBuilder>st=new Stack<>();
        Stack<Integer>times=new Stack<>();
        
        StringBuilder str=new StringBuilder();
        int num=0;
        
        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+ch-'0';
            }
            else if(ch=='['){
                st.push(str);
                str=new StringBuilder();
                times.push(num);
                num=0;
            }
            else if(ch == ']'){
                StringBuilder temp=str;
                str=st.pop();
                int count=times.pop();
                
                while(count-->0){
                    str.append(temp);
                }
            }
            else{
                str.append(ch);
            }
        }
        return str.toString();
        
    }
}
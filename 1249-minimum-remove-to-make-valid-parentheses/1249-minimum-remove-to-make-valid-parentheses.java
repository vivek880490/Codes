class Solution {
    public String minRemoveToMakeValid(String s) {
        
        char ch[]=s.toCharArray();
        int count=0;
        for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        
            if(c=='('){
                count++;
            }
            else if(c==')'){
                if(count>0){
                    count--;
                }
                else{
                    ch[i]='.';
                }
            }
        }
        
        count=0;
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(c==')'){
                count++;
            }
            else if(c=='('){
                
                if(count>0){
                    count--;
                }
                else{
                    ch[i]='.';
                }
                
            }
        }
        
        
        StringBuilder sb=new StringBuilder();
        
        for(char c:ch){
            if(c!='.'){
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
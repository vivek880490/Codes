class Solution {
    public String interpret(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='G'){
                sb.append('G');
            }
            else if(s.charAt(i)=='(' && s.charAt(i+1)!='a'){
                sb.append('o');
                i++;
            }
            else if(s.charAt(i)==')') continue;
            
            else if(s.charAt(i)=='l'){
                sb.append("al");
            }
        }
        return sb.toString();
        
    }
}
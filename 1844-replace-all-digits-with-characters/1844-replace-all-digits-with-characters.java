class Solution {
    public String replaceDigits(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(i%2 == 0){
                sb.append(ch);
            }
            else if(i%2 == 1){
                char c = s.charAt(i-1);
                int x = (c);  
                x+=Character.getNumericValue(ch);
                char p = (char)(x);
                sb.append(p);
            }
        }
        
        return sb.toString();
    }
}
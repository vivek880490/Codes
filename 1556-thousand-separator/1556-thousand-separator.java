class Solution {
    public String thousandSeparator(int n) {
        
        String s = Integer.toString(n);
        if(s.length() <= 3) return s;
        
        StringBuilder sb = new StringBuilder();
        
        int count = 0;
        
        for(int i=s.length()-1; i>=0; i--){
            
            sb.append(s.charAt(i));
            count++;
            if(count == 3){
                sb.append('.');
                count = 0;
            }
            
        }
        
        sb.reverse();
        String str = sb.toString();
        if(str.charAt(0) == '.') return str.substring(1);
        return str;
    }
}
class Solution {
    public String freqAlphabets(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)=='#'){
                
                
                String sc = "";
                
                
                sc+=s.charAt(i-2);
                sc+=s.charAt(i-1);
                
                //System.out.println(sc);
                
                int v = Integer.parseInt(sc);
                
                v = v+96;
                
                char ch = (char)v;
                sb.append(ch);
                i-=2;
                
                
                
                //System.out.println(ch);
                
                
            }
            else{
                
                int x = (int)s.charAt(i)-'0';
                //System.out.println(x);
                x = x+96;
                char ch = (char)x;
                sb.append(ch);
            }
        }
        
        StringBuilder sx = sb.reverse();
        
        return sx.toString();
        
    }
}
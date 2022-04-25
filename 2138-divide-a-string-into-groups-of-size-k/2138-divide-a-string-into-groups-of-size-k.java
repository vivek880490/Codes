class Solution {
    public String[] divideString(String s, int k, char fill) {
       
        StringBuilder sb = new StringBuilder(s);
        
        while(sb.length()%k != 0){
            sb.append(fill);
            
        }
        
        int  n = sb.length()/k;
        
        String ans[] = new String[n];
        int c = 0;
        int idx = 0;
        int i = 0;
        while(i < sb.length()){
            ans[idx++] = sb.substring(i, i+k).toString();
            i += k;
            
        }
        return ans;
    }
}
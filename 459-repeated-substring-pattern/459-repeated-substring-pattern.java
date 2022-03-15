class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        int n = s.length();
        
        for(int i=n/2; i >= 1; i--){
            if(n % i == 0){
                int repeat = n/i;
                
                String substring = s.substring(0,i);
                
                StringBuilder sb = new StringBuilder();
                
                for(int j = 0; j<repeat; j++){
                    
                    sb.append(substring);
                }
                if(sb.toString().equals(s)) return true;
            }
            
            
            
            
        }
        return false;
            
    }
}
class Solution {
    public boolean rotateString(String A, String B) {
        if(A.length() != B.length()) {
            return false;
        }
        
        if(A == null || B == null || A.length() == 0 || B.length() == 0) {
            return true;
        }

         char c = A.charAt(0);
        
        int i=0;
        while(i < B.length()) {
            
            // Find the start A char in B
            while(i < B.length() && B.charAt(i) != c) {
                i++;
            }
            
             if(i == B.length()) {
                return false;
            }
            
            for(int j=0; j < B.length(); j++) {
                
                if(A.charAt(j) != B.charAt((j + i) % B.length())) {
                    break;
                }
                
                 if(j == B.length() - 1) {
                    return true;
                }

        
        }
            
            i++;
          
    }
          return false;
        
    }
}